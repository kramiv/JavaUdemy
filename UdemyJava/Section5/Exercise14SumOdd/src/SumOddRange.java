//took a break from coding for finals. need to review this it took longer than
//usual to complete.

public class SumOddRange {

    public static boolean isOdd(int number){
        boolean returnVal = false;
            if(number%2 != 0) {
                returnVal = true;
            }
        return returnVal;
    }

    public static int sumOdd(int start, int end) {
        int sum = -1;
        if ((start > 0) && (end > 0)) {
            sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
        } else {
            return sum;
        }
        return sum;
    }

}
