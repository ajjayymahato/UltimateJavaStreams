import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NoStartsWith2 {
    public static void compute(Stream<Integer> stream) {
        stream.map(String::valueOf)
                .filter(s->s.startsWith("2"))
                .map(Integer::valueOf)
                .forEach(System.out::println);
    }

    public static void solve() {
        List<Integer> list = Arrays.asList(23,34,55,222,78,72,221);

        compute(list.stream());
    }
}