class Square extends Shape {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public void validate()
  {
    if (side <= 0) {
      throw new IllegalArgumentException("the square side must be positive");
    }
  }

  @Override
  public double calculateArea() {
    return side * side;
  }

  @Override
  public double calculatePerimeter() {
    return 4 * side;
  }

  @Override
  public void printShape() {
    System.out.println("Square Side: " + side);
  }

}
