package com.TCF.BasicsJava;

public class TypeCasting {
	public static void main(String[] args) 
    {
       int intVal = 100;
        double doubleVal = intVal;
        System.out.println("Implicit Casting int to double: " + doubleVal);

        double doubleValue = 99.99;
        int intValue = (int) doubleValue;
        System.out.println("Explicit Casting double to int: " + intValue);

        char letter = 'K';
        int ascii = letter;
        System.out.println("ASCII K: " + ascii);

        int num = 75;
        char character = (char) num;
        System.out.println(" ASCII 75: " + character);
    }
}
