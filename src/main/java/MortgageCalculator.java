import java.util.Scanner;
public class MortgageCalculator {
    public static void main(String[] args) {
        System.out.println("=== Mortgage Calculator ===");
        Scanner read = new Scanner(System.in); // Creates scanner
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

        // Interest
        double monthlyInterest = rate / 12;

        // Number of monthly payments
        int numYears = years * 12;

        // Mortgage formula
        double monthlyPayment = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numYears))
                / (Math.pow(1 + monthlyInterest, numYears) - 1);

        // Total interest
        double totalInterest = (monthlyPayment * numYears) - principal;

        // Results
        System.out.printf("\nMonthly Payment: $%.2f\n", monthlyPayment);

        System.out.printf("Your total interest paid is: $%.2f\n", totalInterest);

        read.close();
        }
}


