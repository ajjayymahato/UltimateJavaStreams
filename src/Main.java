public class Main {
    public static void main(String[] args) {
        //Comment all below calls and run one by one for more clarity

        EqualsHascodeContract.start();
        AvgOfNos.solve();
        SumOfAllNos.solve();
        EvenOddNos.solve();
        NoStartsWith2.solve();
        SquareFilterAvg.solve();
        MaxMin.solve();
        ArraySecondSmallest.solve();
        CommonElements.solve();
        LengthOfLongestString.solve();
        TotalCount.solve();
        FirstRepeatedCharacter.solve();


        //equals related
        String s = new String("hello");
        String s1 = new String("hello");
        System.out.println(s.equals(s1)); // true: String class already overrides the equals() method so it does check content value (deep check), but when you compare objects equals() wont deep check, you will have to override it for deep compare in any custom object comparison
    }
}