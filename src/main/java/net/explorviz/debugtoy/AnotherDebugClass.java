package net.explorviz.debugtoy;

public class AnotherDebugClass {

  private final String id; // mark this one to be included in snapshot
  private String stringAttribute;
  private int intAttribute;
  private float floatAttribute;
  private double doubleAttribute;
  private boolean booleanAttribute;

  private String anotherStringAttribute;
  private int anotherIntAttribute;
  private float anotherFloatAttribute;
  private double anotherDoubleAttribute;
  private boolean anotherBooleanAttribute;

  public AnotherDebugClass(
      final String id,
      final String stringAttribute,
      final int intAttribute,
      final float floatAttribute,
      final double doubleAttribute,
      final boolean booleanAttribute,
      final String anotherStringAttribute,
      final int anotherIntAttribute,
      final float anotherFloatAttribute,
      final double anotherDoubleAttribute,
      final boolean anotherBooleanAttribute
    ) {
    this.id = id;
    this.stringAttribute = stringAttribute;
    this.intAttribute = intAttribute;
    this.floatAttribute = floatAttribute;
    this.doubleAttribute = doubleAttribute;
    this.booleanAttribute = booleanAttribute;
    this.anotherStringAttribute = anotherStringAttribute;
    this.anotherIntAttribute = anotherIntAttribute;
    this.anotherFloatAttribute = anotherFloatAttribute;
    this.anotherDoubleAttribute = anotherDoubleAttribute;
    this.anotherBooleanAttribute = anotherBooleanAttribute;
  }

      

  public String getStringAttribute() {
    return stringAttribute;
  }

  public String getAnotherStringAttribute() {
    return anotherStringAttribute;
  }

  public int getIntAttribute() {
    return intAttribute;
  }

  public int getAnotherIntAttribute() {
    return anotherIntAttribute;
  }

  public float getFloatAttribute() {
    return floatAttribute;
  }

    public float getAnotherFloatAttribute() {
    return anotherFloatAttribute;
  }

  public double getDoubleAttribute() {
    return doubleAttribute;
  }

    public double getAnotherDoubleAttribute() {
    return anotherDoubleAttribute;
  }

  public boolean getBooleanAttribute() {
    return booleanAttribute;
  }

    public boolean getAnotherBooleanAttribute() {
    return anotherBooleanAttribute;
  }

  public void setStringAttribute(final String stringAttribute) {
    this.stringAttribute = stringAttribute;
  }

    public void setAnotherStringAttribute(final String anotherStringAttribute) {
    this.anotherStringAttribute = anotherStringAttribute;
  }

  public void setIntAttribute(final int intAttribute) {
    this.intAttribute = intAttribute;
  }

    public void setAnotherIntAttribute(final int anotherIntAttribute) {
    this.anotherIntAttribute = anotherIntAttribute;
  }

  public void setFloatAttribute(final float floatAttribute) {
    this.floatAttribute = floatAttribute;
  }

  public void setAnotherFloatAttribute(final float anotherFloatAttribute) {
    this.anotherFloatAttribute = anotherFloatAttribute;
  }

  public void setDoubleAttribute(final double doubleAttribute) {
    this.doubleAttribute = doubleAttribute;
  }

  public void setAnotherDoubleAttribute(final double anotherDoubleAttribute) {
    this.anotherDoubleAttribute = anotherDoubleAttribute;
  }

  public void setBooleanAttribute(final boolean booleanAttribute) {
    this.booleanAttribute = booleanAttribute;
  }
  
  public void setAnotherBooleanAttribute(final boolean anotherBooleanAttribute) {
    this.anotherBooleanAttribute = anotherBooleanAttribute;
  }

  @Override
  public String toString() {
    return id;
  }
}
