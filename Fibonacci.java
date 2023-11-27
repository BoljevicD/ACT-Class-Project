import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the term of the Fibonacci sequence (1 to 30): ");
        int term = x.nextInt();

        if (term < 1 || term > 30) {
            System.out.println("Please enter a term between 1 and 30.");
        } else {
            int result = fibonacci(term - 1); // Subtract 1 since the sequence starts from 0
            System.out.println("The " + term + "th term of the Fibonacci sequence is: " + result);
        }

        x.close();
    }
}
