public class Main {
    public static void main(String[] args) {
        /*
        expected output:
        2500
        -1
        0
        13
        -1
        247500
         */
        int output = SumOddRange.sumOdd(1,100);
        System.out.println(output);
        output = SumOddRange.sumOdd(-1,100);
        System.out.println(output);
        output = SumOddRange.sumOdd(100,100);
        System.out.println(output);
        output = SumOddRange.sumOdd(13,13);
        System.out.println(output);
        output = SumOddRange.sumOdd(100,-100);
        System.out.println(output);
        output = SumOddRange.sumOdd(100,1000);
        System.out.println(output);

    }

}
