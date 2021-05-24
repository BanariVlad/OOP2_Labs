package com.company;

class A {
    int a, b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    A(int x) {
        this.b = x;
    }

    void Afis() {
        System.out.println(a + " " + b);
    }
}

public class Task6 {
    public static void main(String[] args) {
        A x = new A(3);
        x.Afis();
    }
}