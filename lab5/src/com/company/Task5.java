package com.company;

public class Task5 {
    static void M(int x) {
        System.out.println("1: " + x);
    }

    static void M(float x) {
        System.out.println("2: " + x);
    }

    static void M(double x) {
        System.out.println("3: " + x);
    }

    static void M(char x) {
        System.out.println("4: " + x);
    }

    static void main(String[] args) {
        M(3.5);
    }
}