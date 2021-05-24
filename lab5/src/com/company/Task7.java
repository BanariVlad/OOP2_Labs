package com.company;

class A1 {
    int x = 1;

    void met() {
        System.out.println("Class A1");
    }
}

class B1 extends A1 {
    int x = 2;

    void met() {
        System.out.println("Class B1");
    }
}

class C1 extends B1 {
    int x = 3;

    void met() {
        System.out.println("Class C1");
    }
}

public class Task7 {
    public static void main(String[] args) {
        A1 q = new B1();
        q.met();

        A1 w = new B1();
        System.out.println(w.x);

        B1 e = new B1();
        e.met();

        B1 r = new C1();
        r.met();
    }
}