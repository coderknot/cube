import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {

  @Test
  public void Cube_instantiatesCorrectly_true() {
    Rectangle testRectangle = new Rectangle(30, 30);
    Cube testCube = new Cube(testRectangle);
    assertTrue(testCube instanceof Cube);
  }

  @Test
  public void getFace_getsFaceOfCube_Rectangle() {
    Rectangle testRectangle = new Rectangle(30, 30);
    Cube testCube = new Cube(testRectangle);
    assertEquals(testRectangle, testCube.getFace());
  }

  @Test
  public void volume_getVolumeOfCube_27000() {
    Rectangle testRectangle = new Rectangle(30, 30);
    Cube testCube = new Cube(testRectangle);
    assertEquals(27000, testCube.volume());
  }
}
