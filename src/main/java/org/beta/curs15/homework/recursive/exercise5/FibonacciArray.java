package org.beta.curs15.homework.recursive.exercise5;

import org.beta.curs15.homework.exceptions.InvalidInputException;
import org.beta.curs15.homework.exceptions.NullInputException;

public class FibonacciArray {
    public static void main(String[] args) {
        System.out.println(fibonacciNthElement(5));
    }
    public static int fibonacciNthElement(Integer n) {
        if (n == null) {
            throw new NullInputException("Null input");
        }

        if (n < 1) {
            throw new InvalidInputException("Invalid input");
        }
        if (n == 0) {
            return 1;
        }
        if (n == 2 || n == 3) {
            return 1;
        }
        return fibonacciNthElement(n - 1) + fibonacciNthElement(n - 2);
    }
}
