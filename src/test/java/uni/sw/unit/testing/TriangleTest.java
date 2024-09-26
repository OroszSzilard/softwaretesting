package uni.sw.unit.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @BeforeAll
    public static void setup(){
        System.out.println("BeforeAll demo: setup test execution");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("Afterall demo: tear down test execution");
    }

    @BeforeEach
    public void initTest(){
        System.out.println("BeforeEach demo: init test case");
    }

    @AfterEach
    public void tearDownTest(){
        System.out.println("AfterEach demo: tear down test case");
    }

    @Test
    public void testGenericTriangle(){
        System.out.println("Testing generic triangle");
        Triangle triangle = new Triangle(3,4,6);

        assertTrue(triangle instanceof Triangle);
        assertFalse(triangle.isIsosceles());
        assertFalse(triangle.isEquilateral());
        //assertFalse(triangle.isRightAngeled());
    }

    @Test
    public void testIsocelesTriangle(){
        System.out.println("Testing isoceles triangle");
        Triangle triangle = new Triangle(3, 3, 5);
        assertTrue(triangle.isIsosceles());
    }

    @Test
    public void testEquilateralTriangle(){
        Triangle triangle = new Triangle(5, 5, 5);

        assertTrue(triangle.isIsosceles());
        assertTrue(triangle.isEquilateral());
    }

    @Test
    public void testRightAngeledTriangle(){
        //Homework
    }

    @Test
    public void testPerimeter(){
        Triangle triangle = new Triangle(100, 251, 178);

        assertEquals(triangle.getPerimeter(), 529, "Calculated perimeter doesn't match expected value");
    }

    @Test
    public void testArea(){
        //Homework
    }

    @Test 
    public void testNotConstructableTriangle(){
        Exception exception1 = assertThrows(ArithmeticException.class, () -> {
            new Triangle(3, 4, 7);
        });
    

        assertTrue(exception1.getMessage().contains("The triangle cannot be constructed from the the numbers"));

        assertThrows(ArithmeticException.class, () -> {
            new Triangle(3, 7, 4);
        
     
        });

        assertThrows(ArithmeticException.class, () -> {
            new Triangle(7, 3, 4);
        
     
        });
    }
}