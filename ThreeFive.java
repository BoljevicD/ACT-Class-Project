public class ThreeFive {

    public static void main(String[] args) {
        int limit = 1000;
        int sum = calculateMultiplesSum(limit);

        System.out.println("The sum of multiples of 3 or 5 below 1000 is: " + sum);
    }

    private static int calculateMultiplesSum(int limit) {
        int sum = 0;

        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}