public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        boolean isLeap = true;
        if ((year >= 1) && (year <= 9999)) {
            //calculate leapyear
            if ((year % 4 == 0)) {
                isLeap = true;
                if (year % 100 == 0) {
                    isLeap = false;
                    if (year % 400 == 0) {
                        isLeap = true;
                    }
                }
            } else {
                isLeap = false;
            }
        } else {
            isLeap = false;
        }
        return isLeap;
    }
}
