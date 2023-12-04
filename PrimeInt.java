/*
A program which displays all prime numbers
between 0 and 200, their population count, 
their sum and average.
 */
public class PrimeInt {

    public static void main(String[] args) { //function that uses the boolean function
        int number; //integer variable 
        int amount = 0;
        int sum = 0;
        for(number = 0; number<=200; number++){ //loops from 0 to 200
            if(isPrime(number)){ //uses the isPrime boolean function and if the value is TRUE prints the number
                System.out.println(number+" ");
                amount +=1;
                sum +=number;
            }
            else{

            }
        }
        System.out.println("The number of prime integers between 0 and 200 is: "+amount);
        System.out.println("Their sum is "+sum);
        System.out.println("Their average: "+(sum/amount));
    }

    static boolean isPrime(int num){ //boolean function which checks if a integer is prime

        if(num<=1){ //if number is smaller or equal to 1 it's not a prime
            return false; //sets boolean value to FALSE
        }
        else{

        }
        for(int i=2;i<=num/2;i++){ //checks every number divided by 2
            if((num%i)==0){ //if the remainder of number/2 is 0, return false
                return false; //sets boolean value to FALSE
            }
            else{

            }
        }
        return true; //sets boolean value to TRUE
    }
}