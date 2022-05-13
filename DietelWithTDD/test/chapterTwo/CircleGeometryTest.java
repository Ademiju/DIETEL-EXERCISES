package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleGeometryTest {
    @Test
    public void displayPrompt(){
        assertEquals("Enter the radius of the circle as an integer",Arithmetic.displayPrompt("Enter the radius of the circle as an integer"));

    }
    @Test
    public void diameterCanBeCalculated_WhenRadiusIsGivenTest(){
        assertEquals(28,CircleGeometry.calculateDiameter(14));

    }
    @Test
    public void circumferenceCanBeCalculated_WhenRadiusIsGivenTest(){
        assertEquals(87.96459430051421,CircleGeometry.calculateCircumference(14));
    }
    @Test
    public void areaCanBeCalculated_WhenRadiusIsGivenTest(){
        assertEquals(615.7521601035994,CircleGeometry.calculateArea(14));
    }
}
