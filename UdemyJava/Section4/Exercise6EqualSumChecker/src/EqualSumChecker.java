public class EqualSumChecker {

    public static boolean hasEqualSum(int val1, int val2, int val3) {
        boolean isSum12Equal3 = false;
        if (val1 + val2 == val3) {
            isSum12Equal3 = true;
        }
        return isSum12Equal3;
    }

}
