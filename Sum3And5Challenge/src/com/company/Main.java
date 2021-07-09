package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int sumCounter = 0;

        for(int i = 1; i <= 1000; i++) {
            if(i % 15 == 0) {
                System.out.println(i);
                sum += i;
                sumCounter++;
            }
            else if(sumCounter == 5) {
                break;
            }
        }
        System.out.println("*****************************");
        System.out.println(15 + 30 + 45 + 60 + 75);
        System.out.println(sum);
    }
}
