import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CircleTest {

  @Test
  public void testCircleCreationWithValidRadius() {
    Circle circle = new Circle(5);
    assertEquals(5, circle.getRadius(), 0);
  }

  @Test
  public void testCalculateArea() {
    Circle circle = new Circle(3);
    assertEquals(9 * Math.PI, circle.calculateArea(), 0);
  }

  @Test
  public void testCalculatePerimeter() {
      Circle circle = new Circle(5);
      assertEquals(2 * Math.PI * 5, circle.calculatePerimeter(), 0);
  }
}
