package numere;

public class Rational {
    private int m, n;

    public Rational(int m, int n) {
        if (n != 0) {
            int d = cmmdc(m, n);
            this.m = m / d;
            this.n = n / d;
        } else {
            System.out.println("Number is null");
        }
    }

    public Rational() {

    }

    static int cmmdc(int m, int n) {
        if (n != 0) {
            return cmmdc(n, m % n);
        } else {
            return m;
        }
    }

    public Rational addition(Rational r) {
        return new Rational(m * r.n + r.m * n, n * r.n);
    }

    public Rational substraction(Rational r) {
        return new Rational(this.m * r.n - this.n * r.m, n * r.n);
    }

    public Rational multiply(Rational r) {
        return new Rational(m * r.m, n * r.n);
    }

    public Rational division(Rational r) {
        if (r.m != 0) {
            return new Rational(m * r.n, n * r.m);
        } else {
            return new Rational(0, 1);
        }
    }

    public boolean isGreater(Rational r) {
        return (double) m / n > (double) r.m / r.n;
    }

    public boolean isLess(Rational r) {
        return (double) m / n < (double) r.m / r.n;
    }

    public boolean isEquals(Rational r) {
        return (double) m / n == (double) r.m / r.n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return m + "/" + n;
    }

    public class Rvector {
        public String suma(Rational arr[]) {
            Rational sum = new Rational(0, 1);

            for (Rational rational : arr) {
                sum = sum.addition(rational);
            }

            return sum.toString();
        }

        public Rational[] sort(Rational arr[]) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j].isGreater(arr[j + 1])) {
                        Rational r = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = r;
                    }
                }
            }

            return arr;
        }
    }
}