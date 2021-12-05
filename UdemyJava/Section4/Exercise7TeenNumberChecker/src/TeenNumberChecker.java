public class TeenNumberChecker {

    public static boolean isTeen(int age) {
        boolean isATeen = false;
        if (age >= 13 && age <= 19) {
            isATeen = true;
        }
        return isATeen;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        boolean hasATeen = false;
        if (isTeen(age1) || isTeen(age2) || isTeen(age3)) {
            hasATeen = true;
        }
        return hasATeen;
    }


}
