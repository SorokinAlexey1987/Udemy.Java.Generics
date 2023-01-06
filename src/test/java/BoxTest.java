import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTest {
    @Test
    public void testBox() {

        Box<String, Integer, Float> box1 = new Box<>("fkfjrv", 20, 30f);
        Box<String, Integer, Float> box2 = new Box<>("fkfjrv", 10, 40f);
        int expected = 100;
        float result = box1.getValue() + box2.getValue() + box1.getValue2() + box2.getValue2();
        assertEquals(expected, result);
    }
}