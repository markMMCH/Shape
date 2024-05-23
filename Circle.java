class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  @Override
  public void validate()
  {
    if (radius <= 0) {
      throw new IllegalArgumentException("the circle radius must be positive");
    }
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public void printShape() {
    System.out.println("Square radius: " + radius);
  }
}
