package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1+2;//operators: = and +.
        // = is an assignment operator. + is addition operator
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        System.out.println("previousResult = " + previousResult);
        //note value is still 3. value has been assigned just once.

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20/5 = 4
        System.out.println("20/5 = " + result);

        result = result % 3;    // remainder of 4%3 = 1
        System.out.println("4 % 3 = " + result);

        //abbreviating operators:
        result++;//     result = result + 1
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);//1

        //result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3*10 = " + result);

        //result = result / 3
        result /= 3;
        System.out.println("30 /3 = " + result);//10

        //result = result - 2;
        result -= 2;//10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        //if-else
        boolean isAlien = false;
        if (isAlien == false) {   //do not put semicolon here
            System.out.println("It is not an alien");
            System.out.println("I am scared of aliens");
        }

        //more operators.
        int topScore = 90;
        if (topScore >= 100) {
            System.out.println("you have the high score");
        }   // == != >= <=

        //"logical and operator" &&
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater than second top score and less than 100");
        }   // additional parentheses help the && statement look nicer

        //logical or operator ||
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("either or both of the conditions are true");
        }

        //bitwise or and and: | & are different.

        int newValue = 50;
        if (newValue == 50) {//==
            System.out.println("this is true");
        }

        boolean isCar = false;
        if (isCar == true) {//shortcut for this: if (isCar).
            System.out.println("this is a car");
        }   //another shortcut: if (!isCar)     i.e. (isCar != true)
        //logical not operator !

        //ternary operator :  shortcut to assigning one of two values to a variable
        //for "if-then" statements.
        isCar = true;
        boolean wasCar = isCar ? true : false;
        //if true, wasCar = true. Else, wasCar = false.
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        //another example of ternary operator.
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        //isEighteenOrOver is true

        //oracle has a summary of operators for java.
        //java operator precedence table. shows how java prioritizes evaluations

        //exercise: "operator challenge" on video 40



        double doubleVar1 = 20.00d;//add d
        double doubleVar2 = 80.00d;
        double sumVar = (doubleVar1 + doubleVar2)*100d;//operator precedence
        System.out.println(sumVar);
        double remainder1 = sumVar % 40.00d;//add d
        System.out.println(remainder1);
        boolean isRemainderZero = (remainder1 == 0) ? true : false;
        System.out.println("boolean value is " + isRemainderZero);
        if (!isRemainderZero) {//careful
            System.out.println("got some remainder");
        }


    }
}

/*
operator is a thing like +
operand are the things acted on by an operator

expression is the full equation
expressions return values or etc.
 */