package org.beta.curs15.homework.recursive.exercise2;

import org.beta.curs15.homework.exceptions.InvalidInputException;
import org.beta.curs15.homework.exceptions.NullInputException;

public class EvenNumbersSumRecursive {
    public static void main(String[] args) {
        System.out.println(evenSum(4));
    }

    public static int evenSum(Integer n) {
        if (n == null) {
            throw new NullInputException("Input cannot be null");
        }
        if (n < 0) {
            throw new InvalidInputException("Input should be higher or equal to 0");
        }
        if (n == 0 || n == 1) {
            return 0;
        }
        return (n * 2 - 2) + evenSum(n - 1);
    }
}
