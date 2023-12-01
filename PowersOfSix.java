/*
Calculates and displays the list of all integer
numbers between 0 and 25000 which are the exact 6th 
power of another integer. Also calculates and displays
their sum, average, variance and standard variation.
 */

import java.util.ArrayList;
import java.util.List;

public class PowersOfSix {

    public static List<Integer> findExactPowers(int power, int start, int end) { //list function
        List<Integer> exactPowers = new ArrayList<>(); //list of integers called exactPowers

        for (int base = (int) Math.pow(start, 1.0 / power); base <= (int) Math.pow(end, 1.0 / power); base++)
        { 
            int number = (int) Math.pow(base, power); //looks at every number as a base and it's powers
            if (start <= number && number <= end) { //if the number is larger or equal to the starting number and smaller or equal to the last number
                exactPowers.add(number); //adds the number into the exactPowers list of integers
            }
        }

        return exactPowers; //returns the values in exactPowers list
    }

    public static double[] calculateStatistics(List<Integer> numbers) { //array function for storing statistics
        int n = numbers.size(); //integer variable n is equal to the number of elements in the list numbers
        int total = 0; //integer variable total set to 0 by default

        for (int num : numbers) { //for each num in numbers add the number to the total
            total += num;
        }

        double average = (double) total / n; //parses total from integer to double and divides it by n
        double variance = 0; //double variable variance set to 0 by default

        for (int num : numbers) { //for each num in numbers: (num - average) to the power of 2 is added to variance
            variance += Math.pow(num - average, 2);
        }

        variance /= n; //variance is divided by n
        double stdDeviation = Math.sqrt(variance); //double variable stdDeviation meaning standard deviation is set equal to the square root of variance

        return new double[]{total, average, variance, stdDeviation}; //returns the values of listed variables in a double array
    }

    public static void main(String[] args) {
        
        List<Integer> exact6thPowers = findExactPowers(6, 0, 25000); //finds all exact 6th powers between 0 and 25000

        double[] statistics = calculateStatistics(exact6thPowers); //calculates statistics for the exact 6th powers

        //prints out the results
        System.out.println("List of exact 6th powers between 0 and 25000: " + exact6thPowers);
        System.out.println("Sum: " + statistics[0]); //prints out the 0 position form statistics[]
        System.out.println("Average: " + statistics[1]); //prints out the 1 position form statistics[]
        System.out.println("Variance: " + statistics[2]); //prints out the 2 position form statistics[]
        System.out.println("Standard Deviation: " + statistics[3]); //prints out the 3 position form statistics[]
    }
}