import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Box<T extends Number & Comparable<T>> {

    private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double avg() {
        double result = 0;
        for (T element : array) {
            result += ((Number) element).doubleValue();
        }
        return result / array.length;
    }

    public int compare(Box<?> another) {
        if(avg() > another.avg()) {
            return 1;
        } else if (avg() < another.avg()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void method(List<Number> numbers) {

    }

    public static void method2(List<? extends Number> numbers) {

    }
}
