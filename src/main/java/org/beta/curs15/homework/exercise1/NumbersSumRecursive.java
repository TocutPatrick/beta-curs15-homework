package org.beta.curs15.homework.exercise1;

import org.beta.curs15.homework.exceptions.InvalidInputException;
import org.beta.curs15.homework.exceptions.NullInputException;

public class NumbersSumRecursive {
    public static void main(String[] args) {
        System.out.println(numbersSum(-1));
    }

    public static int numbersSum(Integer n) {
        if (n == null) {
            throw new NullInputException("Input is null");
        }
        if(n < 0 ){
            throw new InvalidInputException("Input should be higher or equal to  0");
        }
        if (n == 0) {
            return 0;
        }
        return n - 1 + numbersSum(n - 1);
    }

}
