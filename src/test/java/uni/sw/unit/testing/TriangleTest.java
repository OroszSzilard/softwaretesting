package uni.sw.unit.testing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void testGenericTriangle(){
        Triangle triangle = new Triangle(3,4,6);

        assertTrue(triangle instanceof Triangle);
        assertFalse(triangle.isIsosceles());
        //assertFalse(triangle.isEquilateral());
        //assertFalse(triangle.isRightAngeled());
    }
}