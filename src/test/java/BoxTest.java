import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTest {
    @Test
    public void testBox() {

        Box<String, Integer> box1 = new Box<>("fkfjrv", 20);
        Box<String, Integer> box2 = new Box<>("fkfjrv", 10);
        int expected = 30;
        int result = box1.getValue() + box2.getValue();
        assertEquals(expected, result);
    }
}