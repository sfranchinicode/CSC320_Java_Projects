import java.util.Scanner;

public class GroceryBillCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //Prompt user to enter coupon as a decimal
        System.out.println("Enter coupon amount as a decimal. (Example: 0.10)");
        double coupon = scnr.nextDouble();

        //Validate the coupon is set to 0.10 if <= 0 or >= 1
        if (coupon <= 0 || coupon >= 1) {
            coupon = 0.10;
        }

        //Prompt and read grocery bills
        System.out.print("Enter the grocery bill for week 1: $");
        double week1 = scnr.nextDouble();
        System.out.print("Enter the grocery bill for week 2: $");
        double week2 = scnr.nextDouble();
        System.out.print("Enter the grocery bill for week 3: $");
        double week3 = scnr.nextDouble();
        System.out.print("Enter the grocery bill for week 4: $");
        double week4 = scnr.nextDouble();

        //Calculate monthly totals and averages
        double monthlyTotal = week1 + week2 + week3 + week4;
        double weeklyAverage = monthlyTotal / 4;
        double monthlyTotalWithCoupon = monthlyTotal * (1 - coupon);
        double weeklyAverageWithCoupon = monthlyTotalWithCoupon / 4;

        //Display results and utilize printf with %.2f%n to keep decimals controlled
        System.out.printf("Monthly total without the coupon: $%.2f%n", monthlyTotal);
        System.out.printf("Weekly average without the coupon: $%.2f%n", weeklyAverage);
        System.out.printf("Monthly total with the coupon: $%.2f%n", monthlyTotalWithCoupon);
        System.out.printf("Weekly average with the coupon: $%.2f%n", weeklyAverageWithCoupon);

        //Close the scanner
        scnr.close();
    }
}