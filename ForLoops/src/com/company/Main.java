package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i = 8; i>=2; i--) {
            System.out.println("10000 at an interest rate of " + i + "% percent = " + String.format("%.2f",calculateInterest(10000,i)));
        }

        int j = 0;
        for(int i = 2; j < 3; i++) {
            if(isPrime(i)) {
                j++;
            }
            System.out.println(i + "  " + j);
        }
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
