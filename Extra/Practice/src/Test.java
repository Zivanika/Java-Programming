import java.util.*;

class Substraction {
    void subtract(int a, int b) {
        double result = a - b;
        System.out.println("Result: " + result);
    }

    void subtract(int a, int b, int c) {
        double result = a - b - c;
        System.out.println("Result: " + result);
    }

    void subtract(int a, double b) {
        double result = a - b;
        System.out.println("Result: " + result);
    }

    void subtract(double a, int b) {
        double result = a - b;
        System.out.println("Result: " + result);
    }
}

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Substraction ob = new Substraction();
        ob.subtract(5, 7);
        ob.subtract(4, 2, 8);
        ob.subtract(5, 2.2);
        ob.subtract(7.7, 3);
    }
}
