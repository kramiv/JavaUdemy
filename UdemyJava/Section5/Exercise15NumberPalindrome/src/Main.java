public class Main {


    public static void main(String[] args) {
        //output should be true true false
        boolean output = isPalindrome.isPalindrome(-1221);
        System.out.println(output);
        output = isPalindrome.isPalindrome(707);
        System.out.println(output);
        output = isPalindrome.isPalindrome(11212);
        System.out.println(output);
    }


}


        /*

        int number = 25;
        int reverse = 0;

        int lastDigit = number % 10;//      5
        reverse = reverse*10 + lastDigit;//     0+5
        number = number/10;//   25/10 = 2

        lastDigit = number % 10;//  2%10 = 2
        reverse = reverse*10 + lastDigit;//  50 + 2 = 52
        number = number/10;//   2/10 = 0


        int reversedNum = 0;
        while (number > 0) {
            //create palindrome reverseNum
        }
        //compare reversedNum to number
        */