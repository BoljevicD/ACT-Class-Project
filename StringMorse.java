import java.util.*;

public class StringMorse{

    public static void Translator(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        String userInput;
        String textToTranslate;
        StringBuilder translatedText = new StringBuilder();
        char[] alpha = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
        'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
        ' ' };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
        "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
        "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
        "--..", ".----", "..---", "...--", "....-", ".....", "-....",
        "--...", "---..", "----.", "-----", "|" };
        do {
            // get the userinput
        System.out.println("--------------------------------------------------------------");
        System.out.println("Welcome to Morse to English and English to Morse translator!");
        System.out.println("M - Morse to English");
        System.out.println("E - English to Morse");
        System.out.println("X - Exit");
        System.out.println("--------------------------------------------------------------");
        userInput = userInputScanner.nextLine().toUpperCase();
        if(userInput.equals("M"))

        if(userInput.equals("M")){
            System.out.println("Enter a phrase in Morse");
            textToTranslate = userInputScanner.nextLine();
            String[] strings = textToTranslate.split(" ");
            for(String s : strings){
                for(int i=0; i<morse.length; i++){
                    if(morse[i].equals(s)){
                        translatedText.append(alpha[i]);
                        break;
                    }
                }
            }
            System.out.println(translatedText);
        }
        if(userInput.equals("E")){
            System.out.println("Enter a phrase in English");
            textToTranslate = userInputScanner.nextLine().toUpperCase();
            for(int y=0; y<textToTranslate.length(); y++ ){
                for(int z=0; z<alpha.length; z++){
                    if(textToTranslate.charAt(y) == alpha[z]){
                        translatedText.append(morse[z] +" ");
                        break;
                    }
                }
            }
            System.out.println("Morse is:"+translatedText);
        }
        
    }
        while (userInput != "M" || userInput != "E");
        userInputScanner.close();
    }       

}