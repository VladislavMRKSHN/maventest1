import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.area());
    }

    @Test
    void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(18, rectangle.perimeter());
    }

    @Test
    void testRectangleNegativeSide() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Rectangle(-4, 5));
        assertEquals("Ширина и высота должны быть положительными числами.", exception.getMessage());
    }
}
