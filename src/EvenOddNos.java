import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EvenOddNos {
    public static void compute(Stream<Integer> stream) {
        // Collect the stream into a list first to reuse consumed stream
        List<Integer> list = stream.toList();

        List<Integer> evenList = list.stream().filter(e->e%2==0).toList();
        System.out.println(evenList);


        List<Integer> oddList = list.stream().filter(e->e%2!=0).toList();
        System.out.println(oddList);
    }

    public static void solve() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        compute(list.stream());
    }
}