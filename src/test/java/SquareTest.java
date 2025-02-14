import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testSquareArea() {
        Square square = new Square(4);
        assertEquals(16, square.area());
    }

    @Test
    void testSquarePerimeter() {
        Square square = new Square(4);
        assertEquals(16, square.perimeter());
    }

    @Test
    void testSquareNegativeSide() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Square(-3));
        assertEquals("Сторона квадрата должна быть положительным числом.", exception.getMessage());
    }
}
