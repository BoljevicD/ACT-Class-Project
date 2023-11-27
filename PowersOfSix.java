import java.util.ArrayList;
import java.util.List;

public class PowersOfSix {

    public static List<Integer> findExactPowers(int power, int start, int end) {
        List<Integer> exactPowers = new ArrayList<>();

        for (int base = (int) Math.pow(start, 1.0 / power); base <= (int) Math.pow(end, 1.0 / power); base++) {
            int number = (int) Math.pow(base, power);
            if (start <= number && number <= end) {
                exactPowers.add(number);
            }
        }

        return exactPowers;
    }

    public static double[] calculateStatistics(List<Integer> numbers) {
        int n = numbers.size();
        int total = 0;

        for (int num : numbers) {
            total += num;
        }

        double average = (double) total / n;
        double variance = 0;

        for (int num : numbers) {
            variance += Math.pow(num - average, 2);
        }

        variance /= n;
        double stdDeviation = Math.sqrt(variance);

        return new double[]{total, average, variance, stdDeviation};
    }

    public static void main(String[] args) {
        // Find all exact 6th powers between 0 and 25000
        List<Integer> exact6thPowers = findExactPowers(6, 0, 25000);

        // Calculate statistics for the exact 6th powers
        double[] statistics = calculateStatistics(exact6thPowers);

        // Display the results
        System.out.println("List of exact 6th powers between 0 and 25000: " + exact6thPowers);
        System.out.println("Sum: " + statistics[0]);
        System.out.println("Average: " + statistics[1]);
        System.out.println("Variance: " + statistics[2]);
        System.out.println("Standard Deviation: " + statistics[3]);
    }
}
