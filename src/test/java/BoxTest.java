import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTest {
    @Test
    public void testBox() {
        Box<Integer> box1 = new Box<>(20);
        Box<Integer> box2 = new Box<>(10);
        int expected = 30;
        int result = box1.getObject() + box2.getObject();
        assertEquals(expected, result);
    }
}