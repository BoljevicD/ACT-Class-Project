import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        int option;
        Scanner x = new Scanner(System.in);

        System.out.println("Choose an option: ");
        System.out.println("Option 1: Prime Integers");
        System.out.println("Option 2: ");
        System.out.println("Option 3: ");
        System.out.println("Option 4: Number Guessing Game");
        System.out.println("Option 5: ");
        System.out.println("Option 6: ");
        System.out.println("Option 7: Exit");
        option = x.nextInt();

        switch (option) {
            case 1:
                PrimeInt.prime(args);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                NumGuess.numguess(args);
                break;
            case 5:
                
                break;
            case 6:

                break;
            case 7:
                Exit.exit(args);
                break;        
            default:
                System.out.println("Invalid Input!");
                break;
        }
        x.close();
    }
}