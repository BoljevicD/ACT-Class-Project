import java.util.*;

public class NumGuess{
    public static void main(String[] args) {
        int guess, number;
        Scanner x = new Scanner(System.in);

        number = (int) Math.floor(Math.random()*10)+1;

        do{
            System.out.println("Make a guess: ");
            guess = x.nextInt();
        }while(guess != number);

        System.out.println("You guessed!!!");
        x.close();
    }
}