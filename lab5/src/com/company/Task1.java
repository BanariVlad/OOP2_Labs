package com.company;

public class Task1 {

    static int f(int x) {
        return x + 1;
    }

    static void t(int a) {
        System.out.println(++a);
    }

    public static void main(String[] args) {
        t(f(f(f(1))));
    }
}