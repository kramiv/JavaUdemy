public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        boolean isEqual = false;
        double diff = num1 - num2;
        //diff < 0.001 means they are equal up to 3 decimal points
        if (diff > -0.0009 && diff <= 0.0009 ) {
            isEqual = true;
        }
        return isEqual;
    }

}
