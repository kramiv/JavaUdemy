public class Main {//this only has code to test the class, not the solution code

    public static void main(String[] args) {//psvm
        //to call a method from another file:
        //specify class name and then method name.
        long miles = SpeedConverter.toMilesPerHour(10.4);
        System.out.println("miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}
