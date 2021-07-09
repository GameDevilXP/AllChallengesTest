package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeeK(1);
    }

    public static void printDayOfTheWeeK(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
        }

        if(day == 0) { System.out.println("Sunday1") ;}
        else if(day == 1)  System.out.println("Monday1");
        else if(day == 2)  System.out.println("Tuesday1");
        else if(day == 3)  System.out.println("Wednesday1");
        else if(day == 4)  System.out.println("Thursday1");
        else if(day == 5)  System.out.println("Friday1");
        else if(day == 6)  System.out.println("Saturday1");
        else  System.out.println("Invalid1");

    }

}
