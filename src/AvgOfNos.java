import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AvgOfNos {

    /**
     * Converts a Stream of Integer objects into an IntStream of primitive ints.
     *
     * <p>When you create a stream using {@code numbers.stream()}, it produces a {@code Stream<Integer>},
     * which contains Integer objects (boxed integers). However, operations like {@code sum()},
     * {@code average()}, {@code min()}, and {@code max()} require primitive types to work efficiently.</p>
     *
     * <p>The {@code mapToInt(Integer::intValue)} operation transforms each {@code Integer} into a
     * primitive {@code int}, resulting in an {@code IntStream}. Only {@code IntStream} provides
     * direct methods to perform numerical aggregation operations.</p>
     *
     * <p>Example usage:</p>
     * <pre>{@code
     * List<Integer> numbers = Arrays.asList(10, 20, 30);
     * double average = numbers.stream()
     *                         .mapToInt(Integer::intValue)
     *                         .average()
     *                         .orElse(0.0);
     * }</pre>
     */

    private static void compute(Stream<Integer> stream) {
        double avg = stream.mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);
    }

    public static void solve() {
        List<Integer> list = Arrays.asList(2,5,44,33,6,7);

        compute(list.stream());
    }
}