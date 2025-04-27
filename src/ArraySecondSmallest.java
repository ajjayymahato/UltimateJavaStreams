import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySecondSmallest {
    public static void compute(IntStream stream) {
        int ans = stream.distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .getAsInt();

        System.out.println(ans);
    }

    public static void solve() {
        int[] arr = {2,9,99,23,43,1,50};

        compute(Arrays.stream(arr));
    }
}
