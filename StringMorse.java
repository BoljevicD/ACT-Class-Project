import java.util.*;

public class StringMorse{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String a;
        System.out.println("Enter m for Morse to English or e for English to Morse.");
        a = x.nextLine();
        System.out.println(a);
        if (a.equals("m")){
            String morseToEnglish;
            System.out.println("Enter a phrase in Morse Code.");
            morseToEnglish = x.nextLine().toLowerCase();

            int i = 0;

            while(i < morseToEnglish.length() ) {
            HashMap<Character, String> morse = new HashMap<>();
            morse.put('a', ".-");
            morse.put('b', "-...");
            morse.put('c',  "-.-");
            morse.put('d',  "-..");
            morse.put('e',    ".");
            morse.put('f', "..-.");
            morse.put('g',  "--.");
            morse.put('h', "....");
            morse.put('i',   "..");
            morse.put('j', ".---");
            morse.put('k',   "-.");
            morse.put('l', ".-..");
            morse.put('m',   "--");
            morse.put('n',   "-.");
            morse.put('o',  "---");
            morse.put('p', ".--.");
            morse.put('q', "--.-");
            morse.put('r', ".-.");
            morse.put('s',  "...");
            morse.put('t',   "-");
            morse.put('u',  "..-");
            morse.put('v', "...-");
            morse.put('w',  ".--");
            morse.put('x', "-..-");
            morse.put('y', "-.--");
            morse.put('z', "--..");
            morse.put('1', ".----");
            morse.put('2',"..---");
            morse.put('3', "...--");
            morse.put('4', "....-");
            morse.put('5', ".....");
            morse.put('6', "-....");
            morse.put('7', "--...");
            morse.put('8', "---..");
            morse.put('9', "----.");
            morse.put('0', "-----");

            Collection<String>  values= morse.values();

            for (String string: values) {
                System.out.print(string);
            }
            i++;
        }
        }       
        else if (a == "e"){

        }
        else{
            System.out.println("Your input is not valid.");
        }
        x.close();
    }
    
}