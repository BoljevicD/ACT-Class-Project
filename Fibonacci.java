/*
Asks the user which term of the Fibonacci sequence
they would like to see, then calculates and displays it
 */

import java.util.Scanner; //importing the java.util.Scanner package

public class Fibonacci {

    public static int fibonacci(int n) { //integer function with the formula for the fibonacci seq.
        if (n <= 1) { //if n is smaller or equal to 1 return the value of n
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); //returns the result of the formula for the fibonacci seq.
        }
    }

    public static void main(String[] args) { //main function
        Scanner x = new Scanner(System.in); //scanner x for user input

        System.out.print("Enter the term of the Fibonacci sequence (1 to 30): ");
        int term = x.nextInt(); //integer variable equal to user input (x)

        if (term < 1 || term > 30) { //if the input number is outside the scope of 1-30 the program asks for a valid input
            System.out.println("Please enter a term between 1 and 30.");
        } else {
            int result = fibonacci(term - 1); //subtracts 1 since the sequence starts from 0
            System.out.println("The " + term + "th term of the Fibonacci sequence is: " + result);
        }
        x.close(); //closing the scanner to avoid bugs
    }
}
