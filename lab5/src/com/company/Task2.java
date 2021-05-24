package com.company;

public class Task2 {
    static int t(int n) {
        if (n != 0)
            return 10 * t(n/10) + n%10;

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(t(12));
    }
}