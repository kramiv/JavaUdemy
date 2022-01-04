package com.company;

public class Main {

    public static void main(String[] args) {
	int value = 1;
    if(value == 1) {
        System.out.println("value was 1");
    } else if (value == 2) {
        System.out.println("value was 2");
    } else {
        System.out.println("was not 1 or 2");
    }


    int switchValue = 1;
    switch(switchValue) {
        case 1://switchValue == 1
            System.out.println("value was 1");
            break;

        case 2://switchValue == 2
            System.out.println("value was 2");
            break;

        case 3: case 4: case 5:
            System.out.println("was 3,4, or 5");
            System.out.println("it was " + switchValue);
            break;

        default:
            System.out.println("was not 1 or 2");
            break;
    }//if-else is a little more flexible. switch statement only tests one value.
//switch statement is more efficient for a single value

    //exercise: create a break for abcde or else
    char switchChar = 'C';
    switch(switchChar) {
        case 'A':
            System.out.println("it is A");
            break;
        case 'B':
            System.out.println("it is B");
            break;

        case 'C': case'D': case'E':
            System.out.println("it is " + switchChar);
            break;

        default:
            System.out.println("it was none");
    }

    String month = "january";
    switch(month.toLowerCase()) {//toLowerCase is a method from a string class
        // it makes january == January
        //another option: toUpperCase() with JANUARY
        case "january"://test for lowercase version now
            System.out.println("Jan");
            break;
        case "june":
            System.out.println("June");
        default:
            System.out.println("none");
    }

    //challenge
/*
create a method called printDayOfTheWeek
method is void
uses a switch statement that prints day of teh week for a number.
print invalid day otherwise.

my answer:
printDayOfTheWeek(int day) {
switch(day)
--> case 0:
        sout("Sunday");
        break;
    ...
    default:
        sout("invalid day");
        break;
}
 */


    }
}
