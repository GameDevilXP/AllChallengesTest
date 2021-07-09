package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int num) {
        // #0.5 Reverse the number by (x % 10) = (x || y(+= || *= 10 =))
        // #1 Reverse the number and check if the sum of both is the same
        // #2 Reverse the number and check if it's equal to x
        int reverse = 0;
        int lastDigit;
        int numSub = num;

        while(numSub != 0) {
            lastDigit = (numSub % 10);
            reverse *= 10;
            reverse += lastDigit;
            numSub /= 10;
        }

        return num == reverse;
    }

    /*
    Case (11) :
        Loop #1:
            Num is more than 0, lastDigit stores 1 (num % 10)
            reverse is multiplied by 10, reverse += lastDigit
            num is divided by 10 = 1
        Loop #2:
            Num is more than 0, LastDigit stores 1 (num % 10)
            reverse is multiplied by 10 (1 * 10 = 10), reverse += lastDigit
            num is divided by 10 = 0;
        Loop #3:
            Num is == 0, therefore the loop does not execute.
     */
}
