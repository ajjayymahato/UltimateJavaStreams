import java.util.*;
import java.util.stream.*;

public class MaxMin {
    /**
     * This method demonstrates how to find the maximum element in a stream of integers.
     *
     * <h3>For Non-Primitive Streams (Stream<Integer>):</h3>
     * <p>The method uses {@link Comparator#naturalOrder()} with {@link Stream#max(Comparator)} to find the maximum element in a stream.</p>
     * <p>{@link Comparator#naturalOrder()} compares the elements based on their natural ordering,
     * i.e., in ascending order for integers.
     *
     * The {@code max()} method returns an {@link Optional} containing the maximum element if the stream is non-empty.
     * If the stream is empty, an empty {@code Optional} is returned.</p>
     * <p>Example usage:</p>
     *
     * <h3>For Primitive Streams (IntStream):</h3>
     * <p>For primitive streams, such as {@link IntStream}, you can use {@link IntStream#max()} directly, without needing a comparator.
     * This will return an {@link OptionalInt} containing the maximum value if the stream is non-empty.</p>
     *
     * <h3>Notes:</h3>
     * <ul>
     *   <li>For non-primitive streams, the {@code max(Comparator)} method requires a comparator (such as {@link Comparator#naturalOrder()}) to compare the elements.</li>
     *   <li>For primitive streams, {@link IntStream#max()} is optimized to return the maximum of the stream of primitive values directly.</li>
     *   <li>Both methods return an {@code Optional} (or {@code OptionalInt} for primitive streams), which should be checked before accessing the value.</li>
     * </ul>
     *
     * @param stream the input stream of integers to process
     * @return the maximum value in the stream, wrapped in an {@link Optional} for non-primitive streams or {@link OptionalInt} for primitive streams
     * @throws NoSuchElementException if the stream is empty and {@link Optional#orElseThrow()} is used without a default value.
     */


    public static void compute(Stream<Integer> stream) {
        List<Integer> list = stream.toList();

        int max = list.stream().max(Comparator.naturalOrder()).get(); //compares based on natural ordering of stream elements
        System.out.println(max);

        int nonPri = list.stream().mapToInt(e->e).max().getAsInt(); //converted to non primitive, directly use max()
        System.out.println(nonPri);

        int min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
    }

    public static void solve() {
        List<Integer> list = Arrays.asList(23,34,55,222,78,72,221);

        compute(list.stream());
    }
}