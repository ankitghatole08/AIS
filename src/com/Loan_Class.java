package com;
import java.util.Scanner;

public class Loan_Class {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input values
        System.out.print("Enter debt value (in euros): ");
        double debtValue = scanner.nextDouble();

        System.out.print("Enter interest rate (percentage): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter payback duration (months): ");
        int paybackDuration = scanner.nextInt();

        // Calculate loan parameters
        double monthlyRate = calculateMonthlyRate(debtValue, interestRate, paybackDuration);
        int numberOfPayments = paybackDuration;
        double overallDebt = debtValue + calculateTotalInterest(debtValue, interestRate, paybackDuration);

        // Display results
        System.out.println("\nLoan Details:");
        System.out.println("Monthly Rate: " + monthlyRate + " euros");
        System.out.println("Number of Payments: " + numberOfPayments);
        System.out.println("Overall Debt: " + overallDebt + " euros");

        scanner.close();
    }

    static double calculateMonthlyRate(double debt, double interestRate, int duration) {
        double monthlyInterestRate = (interestRate / 100) / 12;
        return (debt * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -duration));
    }

    static double calculateTotalInterest(double debt, double interestRate, int duration) {
        double monthlyRate = calculateMonthlyRate(debt, interestRate, duration);
        return (monthlyRate * duration) - debt;
    }
}
