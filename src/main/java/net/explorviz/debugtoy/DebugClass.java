package net.explorviz.debugtoy;

public class DebugClass {

private final String id; // mark this variable for BOTH snapshots
private String stringAttribute;
private int intAttribute; // mark this variable for BOTH snapshots
private float floatAttribute; // mark this variable for the FIRST snapshot only
private double doubleAttribute; // mark this variable for the SECOND snapshot only
private boolean booleanAttribute; // mark this variable for BOTH snapshots

  public DebugClass(
      final String id,
      final String stringAttribute,
      final int intAttribute,
      final float floatAttribute,
      final double doubleAttribute,
      final boolean booleanAttribute) {
    this.id = id;
    this.stringAttribute = stringAttribute;
    this.intAttribute = intAttribute;
    this.floatAttribute = floatAttribute;
    this.doubleAttribute = doubleAttribute;
    this.booleanAttribute = booleanAttribute;
  }

      

  public String getStringAttribute() {
    return stringAttribute;
  }

  public int getIntAttribute() {
    return intAttribute;
  }

  public float getFloatAttribute() {
    return floatAttribute;
  }

  public double getDoubleAttribute() {
    return doubleAttribute;
  }

  public boolean getBooleanAttribute() {
    return booleanAttribute;
  }

  public void setStringAttribute(final String stringAttribute) {
    this.stringAttribute = stringAttribute;
  }

  public void setIntAttribute(final int intAttribute) {
    this.intAttribute = intAttribute;
  }

  public void setFloatAttribute(final float floatAttribute) {
    this.floatAttribute = floatAttribute;
  }

  public void setDoubleAttribute(final double doubleAttribute) {
    this.doubleAttribute = doubleAttribute;
  }

  public void setBooleanAttribute(final boolean booleanAttribute) {
    this.booleanAttribute = booleanAttribute;
  }

  @Override
  public String toString() {
    return id;
  }
}
