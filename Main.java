/*
Class Main that executes all the other classes
depending on the user input
 */

import java.util.Scanner; //importing the java.util.Scanner package

public class Main{
    public static void main (String[] args){
    
    Scanner x = new Scanner(System.in); //scanner x used for user input
    int option; //integer variable option

    do{
        System.out.println("Choose an option: ");
        System.out.println("Option 1: Prime Integers");
        System.out.println("Option 2: Exact Powers of Six (0-25000) And Their Statistics");
        System.out.println("Option 3: Translate Morse Code to English And Vice Versa");
        System.out.println("Option 4: Number Guessing Game");
        System.out.println("Option 5: Sum of All Multiples of 3 or 5 Bellow 1000");
        System.out.println("Option 6: Nth Term of The Fibonacci Sequence");
        System.out.println("Option 7: Exit");
        System.out.println();
        option = x.nextInt(); //option is equal to user input
        if(option == 1){ //if option is equal to 1 the following code will run
            PrimeInt.prime(args); //class PrimeInt, function prime
            System.out.println();
            continue; //this allows the code to loop back to the beginning after executing PrimeInt.prime
        }
        else if(option == 2){ //if option is equal to 2 the following code will run
            PowersOfSix.main(args); //class PowersOfSix, function main
            System.out.println();
            continue; //this allows the code to loop back to the beginning after executing PowersOfSix.main
        }
        else if(option == 3){ //if option is equal to 3 the following code will run
            System.out.println(); //class PrimeInt, function prime
            System.out.println();
            continue; //this allows the code to loop back to the beginning after executing PrimeInt.prime
        }
        else if(option == 4){ //if option is equal to 4 the following code will run
            NumGuess.numguess(args); //class NumGuess, function numguess
            System.out.println();
            continue; //this allows the code to loop back to the beginning after executing NumGuess.numguess
        }
        else if(option == 5){ //if option is equal to 5 the following code will run
            ThreeFive.main(args); //class ThreeFive, function main
            System.out.println();
            continue; //this allows the code to loop back to the beginning after executing ThreeFive.main
        }
        else if(option == 6){ //if option is equal to 6 the following code will run
            Fibonacci.main(args); //class Fibonacci, function main
            System.out.println();
            continue; //this allows the code to loop back to the beginning after executing Fibonacci.main
        }
        else{ //any other value for option will run the following code
            System.out.println("Invalid input");
            System.out.println();
            continue; //this allows the code to loop back to the beginning
        }
    }while(option != 7);

        x.close();
    }
}