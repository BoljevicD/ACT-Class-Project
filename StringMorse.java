import java.util.Scanner;

public class StringMorse{
    public static void main(){
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
                morseConvert(morse, letter);
                break;
            case 2:
                engConvert(morse, letter);
                break;
            default:
                System.out.println("Invalid input, please pick either 1 or 2.");
                continue;
        }
        }
        while(2<x || x<1);
    }
    public static void morseConvert(String[] morse, char[] letter) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Morse Code: ");
        String userInput = input.nextLine();
        String[] inputArr = userInput.split(" ");
        StringBuilder result = new StringBuilder();
    
        for (String s : inputArr) {
            int index = -1;
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(s)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                result.append(letter[index]);
            } else {
                System.out.println("Unknown Morse Code");
                return;
            }
        }
    
        System.out.println("Converted text: " + result.toString());
    }
    public static void engConvert(String[] morse, char[] letter) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter English Text: ");
        String userInput = input.nextLine();
        StringBuilder result = new StringBuilder();
    
        for (char c : userInput.toCharArray()) {
            boolean found = false;
            for (int i = 0; i < letter.length; i++) {
                if (c == letter[i]) {
                    result.append(morse[i]);
                    result.append(' ');
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Unknown character: " + c);
                return;
            }
        }
    
        System.out.println("Converted Morse Code: " + result.toString().trim());
    }
}