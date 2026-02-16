package org.example;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int idx = 13;
        System.out.println(idx + " : " + isFibonacci(idx));
        System.out.println("Fibonacci of " + idx + " : " +fibonacci(idx));
        System.out.println("Fibonacci Rec of " + idx + " : " +fibonacciRec(idx));
    }

    private static int fibonacci(int input) {
        if (input <= 1) {
            return input;
        }
        int curr = 0, next = 1;
        int[] fibonacci = new int[input + 1];
        fibonacci[0] = 0;
        for (int idx = 0; idx < input; idx++) {
            next = curr + next;
            curr = next - curr;
            fibonacci[idx + 1] =  curr;
        }

        System.out.println("Series: " + Arrays.toString(fibonacci));
        return curr;
    }

    private static int fibonacciRec(int input) {
        if (input <= 1) {
            return input;
        }

        return fibonacciRec(input - 2) + fibonacciRec(input - 1);
    }

    private static String isFibonacci(int input) {
        if (input <= 1) {
            return "is Fibonacci";
        }

        int curr = 0, next = 1;
        for (int idx = 0; idx < input; idx++) {
            next = curr + next;
            if (input == next) {
                return "is Fibonacci";
            }
            curr = next - curr;
        }

        return "is not Fibonacci";
    }
}
