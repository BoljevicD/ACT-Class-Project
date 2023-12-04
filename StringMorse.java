import java.util.Scanner; //importing the java.util.Scanner package

public class StringMorse{
    public static void main(){ //main function that uses the functions morseConvertion and engConervtion
        Scanner input = new Scanner(System.in); //scanner input user for user input
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', //char array containing the english alphabet and numbers
                          'g', 'h', 'i', 'j', 'k', 'l',
                          'm', 'n', 'o', 'p', 'q', 'r',
                          's', 't', 'u', 'v', 'w', 'x',
                          'y', 'z', '1', '2', '3', '4',
                          '5', '6', '7', '8', '9', '0' };
        String[] morse = { ".-", "-...", "-.-.", "-..", ".",
                           "..-.", "--.", "....", "..", ".---",
                           "-.-", ".-..", "--", "-.", "---",
                           ".--.", "--.-", ".-.", "...", "-",
                           "..-", "...-", ".--", "-..-", "-.--",
                           "--..", "|" };
        System.out.println("Type 1 for Morse to English translator");
        System.out.println("Type 2 for English to Morse");
        int x; //integer x that will store te user input
        do{ 
            x = input.nextInt(); //user input for the choice of code
        switch(x){
            case 1: //if x=1 the morseConvert function will run
                morseConvertion(morse, letter);
                break;
            case 2: //if x=2 the engConvert function will run
                engConvert(morse, letter);
                break;
            default: //if x isn't 1 or 2 the following code runs
                System.out.println("Invalid input, please pick either 1 or 2."); 
                continue;
        }
        }
        while(x>2 || 1>x); //the code loops while the statement is true
    }
    public static void morseConvertion(String[] morse, char[] letter) { //morseConvert function 
        Scanner input = new Scanner(System.in); //scanner input for user input
        System.out.println("Enter Morse Code: ");
        String userInput = input.nextLine(); //asks the user for string input
        String[] inputArr = userInput.split(" "); //splitting the userInput string into an array of strings (inputArr)
        StringBuilder result = new StringBuilder(); //used to build the result string

            
            for(String s : inputArr){
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