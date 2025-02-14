import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void testTriangleArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6, triangle.area(), 0.001);
    }

    @Test
    void testTrianglePerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.perimeter());
    }

    @Test
    void testTriangleInvalidSides() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 10));
        assertEquals("Сумма двух сторон треугольника должна быть больше третьей стороны.", exception.getMessage());
    }
}
