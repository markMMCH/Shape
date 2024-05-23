class Triangle extends Shape {
  private double sideA;
  private double sideB;
  private double sideC;
  private double heightA;

  public Triangle(double sideA, double sideB, double sideC, double heightA) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
    this.heightA = heightA;
  }

  @Override
  public void validate()
  {
    if ((sideA <= 0) || (sideB <= 0) || (sideC <= 0) || (heightA <= 0)) {
      throw new IllegalArgumentException("the triangle sides must be positive");
    }
    if ((sideA + sideB <= sideC) || (sideC + sideB <= sideA) || (sideA + sideC <= sideB)) {
      throw new IllegalArgumentException("the sum of the lengths of any two sides of the triangle must be greater than the length of the third side");
    }
  }

  @Override
  public double calculateArea() {
    return (sideC * heightA) / 2;
  }

  public double calculateArea(double sinAngleC) {
    return (sideA * sideB * sinAngleC) / 2;
  }

  @Override
  public double calculatePerimeter() {
    return sideA + sideB + sideC;
  }

  @Override
  public void printShape() {
    System.out.println("Triangle sides: " + sideA + ' ' + sideB + ' ' + sideC);
  }
}