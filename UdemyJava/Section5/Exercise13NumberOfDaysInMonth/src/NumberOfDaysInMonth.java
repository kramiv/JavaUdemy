public class NumberOfDaysInMonth {

    //copy-paste code that checks for leap year
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

    public static int getDaysInMonth(int month, int year) {
        boolean isLeap;
        int days = 0;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            isLeap = isLeapYear(year);
        }
        //if isLeap = true or false
        if (isLeap) {
            switch(month) {
                case 1:
                    days = 31;//january
                    break;
                case 2:
                    days = 29;//february and leap year
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;

            }
        } if (!isLeap) {//else did not work for isLeap
            switch(month) {
                case 1:
                    days = 31;//january
                    break;
                case 2:
                    days = 28;//feburary and not leap year
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;//do I need a default?
            }
        }
        return days;
    }

}
























