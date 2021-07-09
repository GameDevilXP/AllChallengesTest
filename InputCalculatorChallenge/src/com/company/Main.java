package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        double mean = 0;


        System.out.println("Enter your digits: ");
        while(true) {
            boolean isNotInt = scanner.hasNextInt();

            if(isNotInt) {
                int scannedInt = scanner.nextInt();
                count++;
                sum += scannedInt;
                mean = sum/count;
            }
            else  {
                break;
            }

            scanner.nextLine();
        }

        // First try yet again B)
        // I'm just serving W's to myself at this point

        // Further optimization

        if(mean % 1 == 0) {
            int intMean = (int) mean;
            System.out.println("Sum = " + sum + ", Avg = " + intMean);
        }
        else {
            System.out.println("Sum = " + sum + ", Avg = " + mean);
        }
        scanner.close();
    }

}
