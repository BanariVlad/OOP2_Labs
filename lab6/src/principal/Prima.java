package principal;

import numere.Rational;

import java.io.IOException;
import java.util.Scanner;

public class Prima {
    static void sumOfTwoNumbers() throws NumberFormatException, IOException {
        Rational q1;
        Rational q2;
        Rational res;

        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("Sum of 2 rationals numbers");
        System.out.println("*************************");

        System.out.println("Input number Q1");
        q1 = inputNumbers();

        System.out.println("Input number Q1");
        q2 = inputNumbers();

        res = q1.addition(q2);
        System.out.println("Sum:");
        System.out.println(res.getM() + "/" + res.getN());

        res = q1.substraction(q2);
        System.out.println("Difference:");
        System.out.println(res.getM() + "/" + res.getN());

        res = q1.multiply(q2);
        System.out.println("Multiply:");
        System.out.println(res.getM() + "/" + res.getN());
    }

    static void sumOfKNumbers() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("Sum of 2 rationals numbers");
        System.out.println("*************************");
        System.out.println("Input K:");
        int k = scanner.nextInt();

        Rational[] numbersArray = inputNumbers(k);
        Rational rationalObject = new Rational();
        Rational.Rvector rvectorObject = rationalObject.new Rvector();
        System.out.println("Sum = " + rvectorObject.suma(numbersArray));
    }

    public static Rational inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        n1 = scanner.nextInt();
        System.out.println("----");
        n2 = scanner.nextInt();

        return new Rational(n1, n2);
    }

    public static Rational[] inputNumbers(int k) {
        Scanner scanner = new Scanner(System.in);
        Rational[] numbersArray = new Rational[k];

        for (int i = 0; i < k; i++) {
            System.out.println("Input numerator");
            int numerator = scanner.nextInt();
            System.out.println("Input denominator");
            int denominator = scanner.nextInt();
            System.out.println("--------------------");

            Rational rationalNumber = new Rational(numerator, denominator);
            numbersArray[i] = rationalNumber;
        }

        return numbersArray;
    }

    private static void sortOfKNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("Sort of K rational numbers");
        System.out.println("****************************");
        System.out.println("Input K:");
        int k = scanner.nextInt();

        Rational[] vector = inputNumbers(k);

        Rational rationalObject = new Rational();
        System.out.println("Unsorted vector: ");

        for (Rational rational : vector) {
            System.out.println(rational.toString().concat("; "));
        }

        System.out.println("Sorted vector: ");
        Rational.Rvector rvectorObject = rationalObject.new Rvector();
        Rational[] sortedVector = rvectorObject.sort(vector);

        for (Rational rational : sortedVector) {
            System.out.println(rational.toString().concat("; "));
        }
    }

    public static void main(String[] args) throws IOException {
        sumOfTwoNumbers();
        sumOfKNumbers();
        sortOfKNumbers();
    }
}