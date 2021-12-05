public class Main {
    public static void main(String[] args) {

        System.out.println("output should be true true false");

        boolean output = TeenNumberChecker.hasTeen(9,99,19);
        System.out.println(output);

        output = TeenNumberChecker.hasTeen(23,15,42);
        System.out.println(output);

        output = TeenNumberChecker.hasTeen(22,23,24);
        System.out.println(output);
    }
}
