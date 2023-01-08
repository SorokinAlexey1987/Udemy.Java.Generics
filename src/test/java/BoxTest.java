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
        Box.method(numbers);

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        List<Number> numbers2 = new ArrayList<>();
        Box.transfer(numbers, numbers2);
        assertEquals(0, numbers.size());
        assertEquals(10, numbers2.size());
    }
}