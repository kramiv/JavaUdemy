public class Main {

    public static void main(String[] args) {
        boolean output = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(output);

        output = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(output);

        output = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(output);

        output = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(output);
    }

}
