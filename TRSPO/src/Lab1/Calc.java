package Lab1;

import java.util.Scanner;

/**
 * Created by Nick Batist on 11/23/17.
 */

public class Calc {

    int a;
    int b;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus() {
        return a + b;
    }

    public int minus() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int division() {
        return a / b;
    }
}
