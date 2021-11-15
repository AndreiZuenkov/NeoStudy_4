package com.neostudy;

public class Main {
    public static void main(String[] args) {
        byte myByte = 127;
        short myShort = 32767;
        int myInt = 2147483647;
        long myLong = 9223372036854775807L;
        float myFloat = 7.75f;
        double myDouble = 9.29;
        char myChar = 'N';
        boolean myBoolean = true;
        String myString = "Hello NeoStudy";


        System.out.println(calculate(1, 2, 6, 3));
        System.out.println(checkSum(3, 6));
        checkInt(1);
        System.out.println(checkIsNegative(-1));
        printName("Andrey");
        checkYear(2300);

    }

    public static int calculate(int a, int b, int c, int d) {
        int result;

        result = a * (b + (c / d));

        return result;
    }

    public static boolean checkSum(double first, double second) {

        return (first + second >= 10 && first + second <= 20);
    }

    public static void checkInt(int number) {

        if (number >= 0) {
            System.out.println("В метод передали положительное число");
        } else
            System.out.println("В метод передали отрицательно число");

    }

    public static boolean checkIsNegative(int number) {
        return (number < 0);
    }

    public static void printName(String name) {
        System.out.println("Привет, " + name);
    }

    public static void checkYear(int year) {

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");
    }
}
