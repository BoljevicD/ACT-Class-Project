import java.util.*;

public class StringMorse{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String answer;
        String text;
        
        char[] alpha = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
        'X', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
        ' ' };

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
            StringBuilder translated = new StringBuilder();
            for(String s : strings){
                for(int i=0; i<morse.length; i++){
                    if(morse[i].equals(s)){
                        translated.append(alpha[i]);
                        break;
                    }
                }
            }
            System.out.println(translated);
        }
        x.close();
    }

        
}