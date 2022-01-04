public class isPalindrome {

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = number*(-1);
        }

        int reverse = 0;
        int originalNum = number;
        //number = 121
        while (number > 0) {
            int lastDigit = number % 10;
            //lastDigit = 1
            reverse = reverse*10 + lastDigit;
            //reverse = 1
            number = number/10;
            //number = 12

            //lastDigit = 12 % 10 = 2
            //reverse = 10 + 2 = 12
            //number = 12/10 = 1
            
            //lastDigit = 1 % 10 = 1
            //reverse = 120 + 1 = 121
            //number = 1/10 = 0;
            
            //loop stops
        }

        if (reverse == originalNum) {
            return true;
        } else {
            return false;
        }
    }
}
/*
lastDigit = 25%10 = 5

reverse = 1

reverse = reverse*10 = 10

lastDigit = 5 + 10 = 15

number = number / 10
25/10 = 2

repeat until number is greater than 0

 */