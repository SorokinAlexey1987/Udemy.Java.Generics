import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTest {
    @Test
    public void testBox() {
        Box<Integer> box = new Box<>(5, 10, 15);
        Box<Float> box2 = new Box<>(5f, 10f, 15f);
        assertEquals(0, box.compare(box2));

        List<Integer> numbers = new ArrayList<>();
        Box.method2(numbers);
    }
}