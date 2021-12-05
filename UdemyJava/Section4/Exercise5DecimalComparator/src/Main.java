public class Main {
    public static void main(String[] args) {
        //true false true false
        System.out.println("should be true false true false false");

        boolean output = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println(output);

        output = DecimalComparator.areEqualByThreeDecimalPlaces(3.175,3.176);
        System.out.println(output);

        output = DecimalComparator.areEqualByThreeDecimalPlaces(3.0,3.0);
        System.out.println(output);

        output = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123,3.123);
        System.out.println(output);

        output = DecimalComparator.areEqualByThreeDecimalPlaces(3.174,3.175);
        System.out.println(output);
    }
}
