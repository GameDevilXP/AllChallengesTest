package com.company;

public class Main {

    public static void main(String[] args) {
        charChecker();
        rng();
    }

    public static void rng() {
        int switchValue = (int)(Math.random()*10);

        switch (switchValue) {
            case 0:
                System.out.println("Value was 0");
                break;

            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
                System.out.println("Value was 3");
                break;

            case 4:
                System.out.println("Value was 4");
                break;

            case 5:
                System.out.println("Value was 5");
                break;

            case 6:
                System.out.println("Value was 6");
                break;
            case 7:
                System.out.println("Value was 7");
                break;

            case 8:
                System.out.println("Value was 8");
                break;

            case 9:
                System.out.println("Value was 9");
                break;

            case 10:
                System.out.println("Value was 10");
                break;
        }
    }

    public static void charChecker() {
        int charDetermine = (int)(Math.random()*10);
        char randChar;

        switch (charDetermine) {
            case 1: case 2:
                randChar = 'a';
                break;
            case 3: case 4:
                randChar = 'b';
                break;
            case 5: case 6:
                randChar = 'c';
                break;
            case 7: case 8:
                randChar = 'd';
                break;
            case 9: case 10:
                randChar = 'e';
                break;
            default:
                randChar = '-';
        }

        switch (randChar) {
            case 'a':
                System.out.println("RandChar is A");
                break;
            case 'b':
                System.out.println("RandChar is B");
                break;
            case 'c':
                System.out.println("RandChar is C");
                break;
            case 'd':
                System.out.println("RandChar is D");
                break;
            case 'e':
                System.out.println("RandChar is E");
                break;
            default:
                System.out.println("RandChar N/A OR NOT A B C D E");
        }
    }
}
