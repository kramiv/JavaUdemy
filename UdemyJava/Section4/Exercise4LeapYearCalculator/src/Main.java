public class Main {
    public static void main(String[] args) {
        //these should be true
        System.out.println("should be true:");
        boolean output = LeapYearCalculator.isLeapYear(1600);
        System.out.println(output);
        output = LeapYearCalculator.isLeapYear(2000);
        System.out.println(output);
        output = LeapYearCalculator.isLeapYear(2400);
        System.out.println(output);
        output = LeapYearCalculator.isLeapYear(400);
        System.out.println(output);
        output = LeapYearCalculator.isLeapYear(4);
        System.out.println(output);

        //these should be false
        System.out.println("should be false:");
        output = LeapYearCalculator.isLeapYear(100);
        System.out.println(output);

        //exercise test values. false true false true
        System.out.println("should be false true false true:");
        output = LeapYearCalculator.isLeapYear(-1600);
        System.out.println(output);
        output = LeapYearCalculator.isLeapYear(1600);
        System.out.println(output);
        output = LeapYearCalculator.isLeapYear(2017);
        System.out.println(output);
        output = LeapYearCalculator.isLeapYear(2000);
        System.out.println(output);
    }
}
