import java.util.Scanner;

public class StringMorse{
    public static void three(){
        Scanner input = new Scanner(System.in);
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                          'g', 'h', 'i', 'j', 'k', 'l',
                          'm', 'n', 'o', 'p', 'q', 'r',
                          's', 't', 'u', 'v', 'w', 'x',
                          'y', 'z', '1', '2', '3', '4',
                          '5', '6', '7', '8', '9', '0' };
        String[] morse = { ".-",   "-...", "-.-.", "-..",  ".",
                           "..-.", "--.",  "....", "..",   ".---",
                           "-.-",  ".-..", "--",   "-.",   "---",
                           ".--.", "--.-", ".-.",  "...",  "-",
                           "..-",  "...-", ".--",  "-..-", "-.--",
                           "--..", "|" };
        System.out.println("Type 1 for Morse to English translator");
        System.out.println("Type 2 for English to Morse");
        int x;
        do{
            x = input.nextInt();
        switch(x){
            case 1:
                System.out.println("Please provide input:");
                morseConvert(morse, letter);
                break;
            case 2:
                System.out.println("Please provide input:");
                engConvert(morse, letter);
                break;
            default:
                System.out.println("Invalid input, please pick either 1 or 2.");
                String morseLang = input.nextLine();
                engConvert(morse, letter);
                break;
        }
        }
        while(2<x || x<1);
    }
}