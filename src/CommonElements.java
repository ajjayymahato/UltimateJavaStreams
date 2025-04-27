import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
    public static void compute(int[] arr1, int[] arr2) {
        //from stream of first array, check each element present in second array list, list has contains method
        //stream of int is Intstream so box it to Integer type as you are collecting in Integer list
        List<Integer> list = Arrays.stream(arr1)
                .boxed()
                .filter(e->Arrays.asList(arr2).contains(e))
                .collect(Collectors.toList());

        list.stream().forEach(System.out::println);

        //anyMatch works on predicate condition and returns boolean
        List<Integer> ansList = Arrays.stream(arr1)
                .boxed()
                .filter(no1->Arrays.stream(arr2).anyMatch(no2->no2==no1))
                .collect(Collectors.toList());

        ansList.stream().forEach(System.out::println);
    }

    public static void solve() {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {3,5,6,7,9};

        compute(arr1,arr2);
    }
}
