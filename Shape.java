import java.lang.Math;

abstract class Shape {
  public double calculateArea() {
    return 0.0;
  }

  public double calculatePerimeter() {
    return 0.0;
  }

  public void validate() {
  }

  public void printShape() {}
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
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
    return (sideA * heightA) / 2;
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