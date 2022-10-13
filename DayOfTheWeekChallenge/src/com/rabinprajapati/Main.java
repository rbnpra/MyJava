package com.rabinprajapati;

public class Main {
    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(6);


        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);




    }
    // Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
    // The method should not return any value (hint: void)
    // Using a switch statement print "Sunday", "Monday", ....., "Saturday" if the int parameter
    // //"day" is 0, 1, ..., 6 respectively, otherwise it should print "Invalid day".

    // Bonus:
    // Write a second solution using if then else, instead of using switch.
    // Create a new project in Intellij with the name "DayOfTheWeekChallenge"

    private static void printDayOfTheWeek(int day) {
        if(day == 0) {
            System.out.println("Sunday");
        } else if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        } else if(day == 3) {
            System.out.println("Wednesday");
        } else if(day == 4) {
            System.out.println("Thursday");
        } else if(day == 5) {
            System.out.println("Friday");
        } else if(day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
//        switch(day) {
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Invalid day");
//                break;
//        }
//        Write a method called printNumberInWord. The method has one parameter number which is the whole number.
//        The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER"
//        if the int parameter number is 0, 1, 2, .... 9 or other for
//        any other number including negative numbers.
//        You can use if-else statement or switch statement whatever is easier for you.
//
//         NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
//         NOTE: Do not add main method to solution code.


    }
    private static void printNumberInWord(int number) {
//        switch (number) {
//            case 0:
//                System.out.println("Zero");
//                break;
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//            default:
//                System.out.println("Invalid Number");
//                break;
//        }
        if(number == 0) {
            System.out.println("Zero");
        }else if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
