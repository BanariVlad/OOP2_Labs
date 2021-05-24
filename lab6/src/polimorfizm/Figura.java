package polimorfism;

public class Figura {
    public double area() {
        return 0;
    }

    public void printArea() {}
}

class Circle extends Figura {
    int a;

    public Circle (int a) {
        this.a = a;
    }

    public double area() {
        return Math.PI * a * a;
    }

    public void printArea() {
        System.out.println("Circle area is: " + area());
    }
}

class Rect extends Figura {
    int a, b;

    public Rect(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public void printArea() {
        System.out.println("Rectangle area is: " + area());
    }
}

class Trap extends Figura {
    int a, b, h;

    public Trap(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double area() {
        return (a + b) * h / 2;
    }

    public void printArea() {
        System.out.println("Trapeze area is: " + area());
    }
}

class Figure_geom {
    public static void main(String[] args) {
        Figura[] f = new Figura[5];
        f[0] = new Circle(1);
        f[1] = new Rect(1, 1);
        f[2] = new Trap(1, 1, 1);
        f[3] = new Circle(1);
        f[4] = new Rect(1, 1);

        for (Figura figura : f) {
            figura.printArea();
        }
    }
}