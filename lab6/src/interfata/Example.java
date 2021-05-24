package interfata;

import java.util.Scanner;

interface functie {
    int f(int x);
}

class f1 implements functie {
    public int f(int x) {
        return x * x-x;
    }
}

class f2 implements functie {
    public int f(int x) {
        return 8 * x-1;
    }
}

class f3 implements functie {
    public int f(int x) {
        return 3 * x * x-x+10;
    }
}

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number");
        int n = scanner.nextInt();

        functie ob1 = new f1();
        System.out.println("The value of function for object1 is " + ob1.f(n));

        functie ob2 = new f2();
        System.out.println("The value of function for object1 is " + ob2.f(n));

        functie ob3 = new f3();
        System.out.println("The value of function for object1 is " + ob3.f(n));
    }
}