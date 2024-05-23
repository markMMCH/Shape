import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SquareTest {

  @Test
  public void testSquareCreationWithValidSide() {
    Square square = new Square(8.5);
    assertEquals(8.5, square.getSide(), 0);
  }

  @Test
  public void testCalculateArea() {
    Square square = new Square(4);
    assertEquals(16, square.calculateArea(), 0);
  }

  @Test
  public void calculatePerimeter() {
    Square square = new Square(5);
    assertEquals(20, square.calculatePerimeter(), 0);
  }

}
