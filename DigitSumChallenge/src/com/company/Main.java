package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(463875693));
    }

    public static int sumDigits(int num) {
        if(num < 10)
            return -1;
        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 || 125 - 120 = 5
        while(num > 0) {
            // extract and add the smallest digit
            sum += (num % 10);
            // drop the smallest digit
            num /= 10;
        }

        return sum;
    }
}
