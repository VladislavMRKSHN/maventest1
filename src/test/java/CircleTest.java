import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testCircleArea() {
        Circle circle = new Circle(10);
        assertEquals(314.159, circle.area(), 0.001);
    }

    @Test
    void testCirclePerimeter() {
        Circle circle = new Circle(10);
        assertEquals(62.832, circle.perimeter(), 0.001);
    }

    @Test
    void testCircleNegativeRadius() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Circle(-5));
        assertEquals("Радиус должен быть положительным числом.", exception.getMessage());
    }
}
