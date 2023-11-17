public class PrimeInt {

    public static void prime(String[] args) {
        
        int number;
        
        for(number = 0; number<=200; number++){
            if(isPrime(number)){
                System.out.println(number);
            }
            else{

            }
        }

    }

    static boolean isPrime(int num){

        if(num<=1){
            return false;
        }
        else{

        }
        for(int i=2;i<=num/2;i++){
            if((num%i)==0){
                return false;
            }
            else{

            }
        }
        return true;
    }
}