package com;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class Loan_Test {

    @Test
    public void calculateMonthlyRate() {
        double monthlyRate = Loan_Class.calculateMonthlyRate(1000, 5, 12);
        assertEquals(85.61, monthlyRate, 0.01);
    }

    @Test
    public void calculateTotalInterest() {
        double totalInterest = Loan_Class.calculateTotalInterest(1000, 10, 12);
        assertEquals(54.99056, totalInterest, 0.1);
    }

    @Test
   public void loanDetails() {
        double debtValue = 1000;
        double interestRate = 10;
        int paybackDuration = 12;

        double monthlyRate = Loan_Class.calculateMonthlyRate(debtValue, interestRate, paybackDuration);
        int numberOfPayments = paybackDuration;
        double overallDebt = debtValue + Loan_Class.calculateTotalInterest(debtValue, interestRate, paybackDuration);

        assertEquals(87.91588, monthlyRate, 0.1);
        assertEquals(12, numberOfPayments);
        assertEquals(1054.9906, overallDebt, 0.1);
    }
}
