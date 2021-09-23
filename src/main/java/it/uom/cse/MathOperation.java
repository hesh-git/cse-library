package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int fib(n) {
        if (n == 0) return 1;
        int a = 1, b = 1;
        n-=2;
        for (int i = 0; i < n; i++) {
            b+=a;
            a=b-a;
        }
        return b;
    }
  }

}
