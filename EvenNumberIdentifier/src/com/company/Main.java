package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 4;
        int finishNumber = 20;
        int count = 0;
        int total = 0;
        while(num <= finishNumber) {
            num++;
            if(!isEvenNumber(num)) {
                continue;
            }
            System.out.println("Even Number = " + num);
            count++;
            total += num;
            if(count == 5) {
                break;
            }
        }
        System.out.println(total);

    }

    public static boolean isEvenNumber(int x) {
        return x % 2 == 0;
    }
}
