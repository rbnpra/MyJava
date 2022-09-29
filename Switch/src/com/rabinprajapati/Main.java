package com.rabinprajapati; // control flow statement

public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 5;

        switch(switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue); // interesting idea
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // New Challenge !
        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charValue = 'D';
        switch (charValue) {
            case 'A':
                System.out.println("charValue was A");
                break;

            case 'B':
                System.out.println("charValue was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("was a C, or a D, or an E");
                System.out.println("Actually it was a " + charValue); // interesting idea
                break;

            default:
                System.out.println("message saying not found");

        }

        String month = "January";
        switch(month.toUpperCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

        String day = "Monday";
        switch(day) {
            case "Sunday":
            System.out.println("Sun");
            break;

            case "Monday":
                System.out.println("Mon");
                break;

            case "Tuesday":
                System.out.println("Tues");
                break;

            case "Wednesday":
                System.out.println("Wed");
                break;

            case "Thursday":
                System.out.println("Thus");
                break;
            case "Friday":
                System.out.println("Fri");
                break;
            case "Saturday":
                System.out.println("Sat");
                break;
            default:
                System.out.println("Not available day");


        }




    }
}
