package com.amigoscode._1_beginners;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class _3_TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        int intNumber=23;
        double doubleNumber=intNumber;
        // Print both variables to see the result.
        System.out.println(intNumber);
        System.out.println(doubleNumber);


        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        double doubleNumber1=22.12;
        int intnumber1= (int) doubleNumber1;
        // Print both variables to see what happens to the decimal part.
        System.out.println(doubleNumber1);
        System.out.println(intnumber1);


        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        int num=65;
        char ch= (char) num;
        // Print the resulting char.
        System.out.println(ch);


        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        char ch1='Z';
        int num1= ch1;
        // Print the resulting int.
        System.out.println(num1);

        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        String num2="42";
        int num3=Integer.parseInt(num2);
        // Print the result.
        System.out.println(num3);


        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        int num4=42;
        String num5= String.valueOf(42);
        // Print the result.
        System.out.println(num5);

    }
}
