import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {



  @Test
  public void testCalculateArea() {
    Triangle triangle = new Triangle(3, 4, 5, 2.4);
    assertEquals(6, triangle.calculateArea(), 0);
  }

  @Test
  public void testCalculatePerimeter() {
    Triangle triangle = new Triangle(3, 4, 5, 2.4);
    assertEquals(12, triangle.calculatePerimeter(), 0);
  }
}