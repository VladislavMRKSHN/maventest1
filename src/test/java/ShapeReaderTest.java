import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShapeReaderTest {
    @Test
    void testReadShapesFromFile() throws IOException {
        String testFilePath = "test_shapes.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFilePath))) {
            writer.write("circle 10\n");
            writer.write("square 4\n");
            writer.write("rectangle 4 5\n");
            writer.write("triangle 3 4 5\n");
        }

        List<Shape> shapes = ShapeReader.readShapesFromFile(testFilePath);
        assertEquals(4, shapes.size());
        assertTrue(shapes.get(0) instanceof Circle);
        assertTrue(shapes.get(1) instanceof Square);
        assertTrue(shapes.get(2) instanceof Rectangle);
        assertTrue(shapes.get(3) instanceof Triangle);

        new File(testFilePath).delete(); // Удаление тестового файла
    }

    @Test
    void testReadShapesFromNonexistentFile() {
        List<Shape> shapes = ShapeReader.readShapesFromFile("nonexistent.txt");
        assertTrue(shapes.isEmpty());
    }
}
