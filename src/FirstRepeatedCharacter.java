import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstRepeatedCharacter {
    public static void compute(IntStream stream) {
        //this intstream has ascii values of all chars
        Character s = stream.mapToObj(c->Character.toLowerCase((char)c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1) //for non repeated char check ==1
                .findFirst()
                .map(c->c.getKey())
                .get();

        System.out.println(s);
    }

    public static void solve() {
        String str = "This is Ajay Mahato here. Happy Learning!";

        compute(str.chars());
    }
}
