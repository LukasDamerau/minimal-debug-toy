package net.explorviz.debugtoy;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

  /**
 * When comparing both snapshots, we expect visualizations for:
 *
 * - one added instance:
 *   all chimneys are green on one platform on top of the DebugClass.java building
 *
 * - one instance that exists in both snapshots:
 *   - two modified attributes: two black chimneys
 *   - one missing attribute: one red chimney
 *   - one newly captured attribute: one green chimney
 *   - one unchanged attribute: one blue chimney
 *
 * - two missing/deleted instances:
 *   one platform on the DebugClass.java building and one platform on the
 *   AnotherDebugClass.java building, each with only red chimneys
 */
  public static void main(final String[] args) {

    //final Map<String, Object> objects = new LinkedHashMap<>();

    final DebugClass inBothSnapshots = new DebugClass(
      "idInBothSnapshots",
      "in-both-snapshots-and-values-partially-changed",
      24,
      42.0f,
      420.0d,
      true
    );
    firstSnapshotPhase();
    final DebugClass onlyInSecondSnapshot = new DebugClass(
      "idOnlyInSecondSnapshot",
      "only-in-snapshot-2",
      42,
      42.0f,
      42.0d,
      true
    );

    breakpointForSnapshot();
    inBothSnapshots.setBooleanAttribute(false);
    inBothSnapshots.setIntAttribute(42);

    preventGarbageCollectionOfObjectByUsingIt(inBothSnapshots);
    preventGarbageCollectionOfObjectByUsingIt(onlyInSecondSnapshot);
      
  }

  private static void preventGarbageCollectionOfObjectByUsingIt(final Object object) {
    System.out.println("Hello from " + object.toString());
  }
}


 private static void firstSnapshotPhase() {
    final DebugClass onlyInFirstSnapshot = new DebugClass(
      "idOnlyInFirstSnapshot",
      "only-in-snapshot-1",
      42,
      42.0f,
      42.0d,
      true
    );

    final AnotherDebugClass onlyInFirstSnapshot2 = new AnotherDebugClass(
      "anotherIdOnlyInFirstSnapshot",
      "only-in-snapshot-1",
      42,
      42.0f,
      42.0d,
      true,
      "only-in-snapshot-1",
      42,
      42.0f,
      42.0d,
      true
    );

    breakpointForSnapshot();

    preventGarbageCollectionOfObjectByUsingIt(onlyInFirstSnapshot);
    preventGarbageCollectionOfObjectByUsingIt(onlyInFirstSnapshot2);
  }

  private static void breakpointForSnapshot() {
    // SET BREAKPOINT ON THIS LINE TO HALT THE PROGRAM TWO TIMES FOR SNAPSHOT CREATION
  }
}
