package com.company;

public class Main {

    public static void main(String[] args) {
	    sumOdd(1,10000);
        System.out.println(Integer.MAX_VALUE);
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if(start <= 0 || end < start)
            return -1;

        int oddSum = 0;

        for(int i = start; i <= end; i++) {
            if(isOdd(i))
                oddSum += i;
        }
        System.out.println(oddSum);

        return oddSum;
    }

    /*
    Can't find any way to reduce the overall code, maybe someone on StackOverflow or Github could help but for now,
    26 lines is the fastest and best way to do this. :/
     */
}
