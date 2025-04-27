import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfAllNos {
    public static void compute(Stream<Integer> stream) {
        Integer ans = stream.reduce((a,b)->a+b).get();
        System.out.println(ans);
    }

    public static void solve() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        compute(list.stream());
    }
}
