public class Main {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(5, 6, 10, 7);
    triangle.validate();
    triangle.printShape();
    System.out.println(triangle.calculateArea());
    System.out.println(triangle.calculatePerimeter());
  }
}
