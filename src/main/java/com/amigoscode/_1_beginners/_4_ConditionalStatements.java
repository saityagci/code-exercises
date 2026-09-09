package com.amigoscode._1_beginners;

/**
 * Exercise: Conditional Statements
 *
 * Learn how to control the flow of your program using if/else and switch statements.
 * Conditional statements allow your program to make decisions based on conditions.
 */
public class _4_ConditionalStatements {

    public static void main(String[] args) {

        // TODO: 1 - Write an if statement that prints "Positive" if a number is greater than 0
        // Declare an int variable called number and assign it a positive value.

        int number = 7;
        String result = "";
        if (number > 0) {
            result = "Positive";
        }


        // TODO: 2 - Add an else clause to the above that prints "Not positive"
        // Change the value of number to a negative value or 0 to test both branches.
         else {
            result = "Negative";
        }
        System.out.println("The Number is "+result);


        // TODO: 3 - Write an if/else if/else chain for grade classification
        // Declare an int variable called score and assign it a value (0-100).
        // If score >= 90, print "Grade: A"
        // Else if score >= 80, print "Grade: B"
        // Else if score >= 70, print "Grade: C"
        // Else print "Grade: F"

        int score = 85;
        char grade;
        if (score>=90){
            grade='A';
        } else if (score<=80) {
            grade='B';

        } else if (score<=70) {
            grade='C';

        }else grade='D';

        System.out.println("Grade "+grade);


        // TODO: 4 - Write a switch statement for day of the week
        // Declare an int variable called day (1-7).
        // Use a switch statement to print the day name:
        //   1 -> "Monday", 2 -> "Tuesday", ... 7 -> "Sunday"
        // Include a default case for invalid values.

        int day = 3;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("WEdnesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }



        // TODO: 5 - Use a switch statement with a String
        // Declare a String variable called month (e.g., "February").
        // Use a switch statement to print the number of days in that month.
        // Handle at least 3-4 months plus a default case.

        String month = "February";
        switch(month){
            case "January":
            case "March":
            case "May":
            case "July":
                System.out.println("31 Days");
                break;
            case "February":
                System.out.println("28 Days");
                break;
            case "April":
            case "June":
                System.out.println("30 Days");
                break;
            default:
                System.out.println("Unknown month");
        }


        // TODO: 6 - Use a switch expression (Java 14+) to return a value
        // Using the 'day' variable from above, assign the day name to a String
        // using a switch expression with arrow syntax:
        //   String dayName = switch (day) {
        //       case 1 -> "Monday";
        //       ...
        //   };
        // Print the result.


            String dayName = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid day";
            };
        System.out.println(dayName);


        // TODO: 7 - Write a nested if statement to check if a number is positive AND even
        // Declare an int variable called value.
        // First check if it is positive (> 0).
        //   If positive, check if it is even (value % 2 == 0).
        //     If even, print "Positive and even"
        //     Else print "Positive and odd"
        //   Else print "Not positive"

        int value = 8;
         if (value > 0) {
             if (value % 2 == 0) {
                 System.out.println("Positive and Even");

             } else {
                 System.out.println("Positive and Odd");
             }
         }
             else{
                 System.out.println("Not Positive");

             }

         }

    }

