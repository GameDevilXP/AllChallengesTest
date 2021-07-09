package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 5;
	    while(count != 5) {
            System.out.println("Count is equal to " + count);
            count++;
        }

	    count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count == 100) {
                break;
            }
        } while(count != 6);
    }
}
