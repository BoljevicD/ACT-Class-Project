import java.util.*;

public class StringMorse{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String answer;
        String text;
        
        String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
        "X", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
        " " };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
        "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
        "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
        "--..", ".----", "..---", "...--", "....-", ".....", "-....",
        "--...", "---..", "----.", "-----", "|" };

        System.out.println("Type M for Morse to English or E for English to Morse");
        answer = x.nextLine();

        if(answer.equals("M")){
            System.out.println("Enter a phrase in Morse");
            text = x.nextLine();
            String[] strings = text.split(" ");
            StringBuilder english = new StringBuilder();
            for(String s : strings){
                for(int i=0; i<morse.length; i++){
                    if(morse[i].equals(s)){
                        english.append(alpha[i]);
                        break;
                    }
                }
            }
            System.out.println(english);
        }
        else if(answer.equals("E")){
            System.out.println("Enter a phrase in English");
            text = x.nextLine();
            String[] strings = text.split(" ");
            StringBuilder morseCode = new StringBuilder();
            for(String s : strings){
                for(int i=0; i<alpha.length; i++){
                    if(alpha[i].equals(s)){
                        morseCode.append(morse[i]);
                        break;
                    }
                }
            }
            System.out.println(morseCode);
        }
        x.close();
    }

        
}