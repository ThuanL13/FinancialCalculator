import java.util.Scanner;
public class CDCalculator {
    // Variables
    static int daysPerYear = 365;

    public static void main(String[] args) {
        System.out.println("=== CD Calculator ===");
        Scanner read = new Scanner(System.in); // Creating Scanner
        calculateCD(read);
    }
    // Method for calculations
    public static void calculateCD(Scanner read) {
        // Asking for user input
        System.out.println("What is your deposit amount?: "); // Initial deposit
        double principal = read.nextDouble();

        System.out.println("What is your annual interest rate percentage?: ");
        double ratePercent = read.nextDouble();

        System.out.println("How many years for maturity?: ");
        double years = read.nextDouble();

        // Converting % to decimal
        double rate = ratePercent / 100.0;

        // Number of days
        double numDays = daysPerYear * years; // Daily compounding, assuming 365 days per year

        // Determining Future value (FV = Principal × (1 + (rate / days per year))^num days)
        double futureValue = principal * Math.pow((1 + (rate / daysPerYear)), numDays);

        // Interest Earned (FV - P = total interest earned)
        double interestEarned = futureValue - principal;

        System.out.printf("\nFuture Value; $%.2f%n", futureValue);
        System.out.printf("Your interest accrued is: $%.2f%n", interestEarned);

        read.close();
    }
}
