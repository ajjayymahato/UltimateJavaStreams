import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SquareFilterAvg {
    /**
     * Computes the average of squared integers from a stream that are greater than 30
     * and prints the result.
     *
     * <p>Steps performed:</p>
     * <ul>
     *   <li>{@code map}: Transforms each element by squaring it.
     *       <br>Each element of the stream is squared using the function {@code e -> e * e}.</li>
     *   <li>{@code filter}: Filters out elements whose squared value is less than or equal to 30.
     *       <br>After the squaring operation, only values greater than 30 are retained in the stream.</li>
     *   <li>{@code mapToInt}: Converts the stream from {@code Stream<Integer>} to {@code IntStream}.
     *       <br>The stream of squared integers is converted into an {@code IntStream}, which is required to calculate the average.</li>
     *   <li>{@code average}: Computes the average of the elements in the stream.
     *       <br>Calculates the average of the filtered squared values.</li>
     *   <li>{@code getAsDouble}: Retrieves the average as a {@code double} value.
     *       <br>If the stream is non-empty, this will return the average. Otherwise, it will throw a {@code NoSuchElementException}.</li>
     * </ul>
     *
     * @param stream the input stream of integers to process
     * @throws java.util.NoSuchElementException if the stream is empty after filtering and squaring
     */

    public static void compute(Stream<Integer> stream) {
        double ans = stream.map(e->e*e)
                .filter(e->e>30)
                .mapToInt(e->e)
                .average()
                .getAsDouble();

        System.out.println(ans);
    }

    public static void solve() {
        List<Integer> list = Arrays.asList(2,4,9,12,22,40);
        compute(list.stream());
    }
}