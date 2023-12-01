/*
The program picks a random integer between 0 and
65 and then asks the user to guess what it is. 
Every time the user misses a guess the program
tells them if their guess was higher or lower than the target number.
When the user guesses the number, the program congratulates them.
 */

import java.util.*; //imported the entire java.util package

public class NumGuess{
    public static void main(String[] args) { //function numguess
        int guess, number; //integer variables guess and number
        int count = 0;
        Scanner x = new Scanner(System.in); //scanner x used for user input

        number = (int) Math.floor(Math.random()*10)+1; //math function for randomizing numbers from 1 to 10

        do{
            System.out.println("Make a guess: ");
            guess = x.nextInt(); //variable guess is equal to user input
            
            if(guess < number){ //if the guess is lower than the randomly generated number prints Higher
                System.out.println("Higher");
                
            }
            else if(guess > number){ //if the guess is higher than the randomly generated number prints Lower
                System.out.println("Lower");
            }
            count++;
        }while(guess != number); //loops the code until the user guesses the number

        System.out.println("You guessed!!! \nNumber of guesses: "+count);
    }
}
