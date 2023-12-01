//Calculates the sum of all the multiples of 3 or 5 below 1000.

public class ThreeFive {

    public static void main(String[] args) {
        int limit = 1000; //integer variable limit set to 1000 as specified
        int sum = MultiplesSum(limit); //integer variable sum set to the value found in the integer function bellow

        System.out.println("The sum of multiples of 3 or 5 below 1000 is: " + sum); //prints the result
    }

    private static int MultiplesSum(int limit) { //integer function for summing the found multiples
        int sum = 0; //integer variable sum set to 0 by default

        for(int i = 1; i < limit; i++){ //loops from 1 to the set limit (1000 in this case)
            if (i % 3 == 0 || i % 5 == 0){ //if the remainder of number divided by 3 or number divided by 5 is 0 adds the number to sum
                sum += i;
            }
        }

        return sum; //returns the value of variable sum
    }
}