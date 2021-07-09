package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largestNum = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(true) {
            System.out.println("Enter your number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int num = scanner.nextInt();
                if(num > largestNum) {
                    largestNum = num;
                }
                if(num < min) {
                    min = num;
                }
            }
            else if(!hasNextInt) {
                break;
            }
            scanner.nextLine();

            // For the minimum number, I almost forgot about it, but,
            // maybe just compare every number and check if the next one that's put in is smaller?

            // I found something out
            // If you enter a number which is more than than the max integer number
            // Then only the last input is taken in
            // For example :
            /*
            Enter your number: 20
            Enter your number: 243325803298561325643

            Out of these two, even though the latter is larger, it takes 20 in.
            I don't know why though, maybe the process finishes if we break it?
            (Put a number higher than the max num), either way, I can only hope
            future me finds out, good luck me!
             */
        }

        System.out.println("Largest number out of all given numbers is: " + largestNum);
        System.out.println("And the smallest number out of all the given numbers is: " + min);
    }
}
