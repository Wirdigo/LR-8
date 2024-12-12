package org.example;

public class AlgorithmicMethods {
    public int findMinPositiveElement(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element > 0 && element < min) {
                min = element;
            }
        }
        return min;
    }

    public int calculateSumOfNegativeElements(int[] array) {
        int sum = 0;
        for (int element : array) {
            if (element < 0) {
                sum += element;
            }
        }
        return sum;
    }

    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N cannot be negative.");
        }
        if (n <= 1) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public double calculateCurrentStrength(double resistance, double voltage) {
        if (resistance == 0) {
            throw new ArithmeticException("Resistance cannot be zero.");
        }
        return voltage / resistance;
    }
}