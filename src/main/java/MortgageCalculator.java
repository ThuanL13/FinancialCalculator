import java.util.Scanner;
public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); // Creates scanner
        System.out.println("=== Mortgage Calculator ===");
        calculateMortgage(read);
    }
    // Method to calculate mortgage payment and total interest
    public static void calculateMortgage(Scanner read) {
        // Asking for user input
        System.out.println("Enter your loan principal: ");
        double principal = read.nextDouble();

        System.out.println("What is your annual interest rate?: ");
        double annualRate = read.nextDouble();

        System.out.println("How long is your loan(years)?: ");
        int years = read.nextInt();

        // Converting annual rate to decimal
        double rate = annualRate / 100;

        // Monthly interest
        double interest = rate / 12;

        // Number of monthly payments
        int numYears = years * 12;

        // Mortgage formula
        double monthlyPayment = principal * (interest * Math.pow(1 + interest, numYears))
                / (Math.pow(1 + interest, numYears) - 1);

        // Total interest
        double totalInterest = (monthlyPayment * numYears) - principal;

        // Results
        System.out.printf("\nMonthly Payment: $%.2f\n", monthlyPayment);

        System.out.printf("Your total interest paid is: $%.2f\n",totalInterest);

        read.close();
        }
}


