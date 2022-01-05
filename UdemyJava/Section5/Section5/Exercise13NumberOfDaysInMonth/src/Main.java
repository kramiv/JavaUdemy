public class Main {

    public static void main(String[] args) {

        //outputs should be 31, 29, 28, -1, -1
        int output = NumberOfDaysInMonth.getDaysInMonth(1,2020);
        System.out.println(output);

        output = NumberOfDaysInMonth.getDaysInMonth(2,2020);
        System.out.println(output);

        output = NumberOfDaysInMonth.getDaysInMonth(2,2018);
        System.out.println(output);

        output = NumberOfDaysInMonth.getDaysInMonth(-1,2020);
        System.out.println(output);

        output = NumberOfDaysInMonth.getDaysInMonth(1,-2020);
        System.out.println(output);
    }

}
