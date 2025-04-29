import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TotalCount {
    public static void compute(Stream<Integer> stream) {
        Long count = stream.count();
        System.out.println(count);
    }

    public static void solve() {
        List<Integer> list = Arrays.asList(23,34,55,222,78,72,221);

        compute(list.stream());
    }
}
