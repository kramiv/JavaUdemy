public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            return wakeUp;//    returns false
        } else if ((barking && hourOfDay < 8) || (barking && hourOfDay > 22)) {
            wakeUp = true;
        } else {
            wakeUp = false;
        }
        return wakeUp;
    }

}
