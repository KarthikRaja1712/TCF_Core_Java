package com.TCF.BasicsJava;

public class ControlStatements{

    public static void main(String[] args) {
        int n = 654654;
        int a;
        int b;

        if (n > 0) {
            System.out.println("positive");
        } else if (n< 0) {
            System.out.println("Negative");
        } else {
            System.out.println("zero");
        }

        int day = 3;
        switch (day) {
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
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
        for(int i=0;i<10;i++)
        	System.out.print("* ");
        int i=10;
        while(i!=0)
        {
        	System.out.print("% ");
        	i--;
        }

    
    }
    }