import java.util.*;

public class Exit{
    public static void main (String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Are you sure?");
        System.out.println("(Respond with YES or NO)");
        String response = x.nextLine();

        if(response.equals("NO")){
            System.out.println("You are still in the program");
        }
        else if (response.equals("YES")){
            System.exit(0);
        }
        else{
            System.out.println("Please respond with YES or NO");
        }
        x.close();
    }
}