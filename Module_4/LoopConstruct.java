import java.util.Scanner;

public class LoopConstruct {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Initialize variables
        double total = 0;
        int count = 0;
        double max = 0;
        double min = 0;

        // Use a while loop to keep the count limited to 5
        while (count < 5) {
            System.out.println("Enter your value: ");
            double num = scnr.nextDouble();

            // Nested loop to update the max and min as inputs are recieved
            if (count == 0) {
                max = num;
                min = num;
            }
            else {
                if (num > max){  
                    max = num;
                }
                if (num < min) { 
                   min = num;
                }
            }
            total = total + num;

            // Increase the count by 1 each iteration
            count ++; 
        }
        double average = total / count;
        double interest = total * 0.20;

        System.out.println("The total of the numbers is: " + total);
        System.out.println("The average of the numbers is: " + average);
        System.out.println("The maximum number input was: " + max);
        System.out.println("The minimum number input was: " + min);
        System.out.println("The interest on the total is: " + interest);
    }
}