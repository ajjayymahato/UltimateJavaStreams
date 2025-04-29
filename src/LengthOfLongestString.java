import java.util.Arrays;

public class LengthOfLongestString {
    public static void compute(String[] strings) {
        //max() doesnt work on Objects (Integer) directly so need to mapToInt
        int len = Arrays.stream(strings).mapToInt(String::length).max().getAsInt();
        System.out.println(len);
    }

    public static void solve() {
        String[] strings = {"Apple","Banana","Very Funny"};

        compute(strings);
    }
}
