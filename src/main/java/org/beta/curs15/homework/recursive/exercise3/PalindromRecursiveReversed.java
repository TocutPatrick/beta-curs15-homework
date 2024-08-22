package org.beta.curs15.homework.recursive.exercise3;

import org.beta.curs15.homework.exceptions.NullInputException;

public class PalindromRecursiveReversed {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ana"));
        System.out.println(stringPalindrom("tetet"));
    }

    public static String stringReverse(String x) {
        if (x.length() <= 1) {
            return x;
        }
        return stringReverse(x.substring(1)) + x.charAt(0);
    }

    public static Boolean stringPalindrom(String x) {
        if (x == null) {
            throw new NullInputException("Input cannot be null");
        }
        if (x.length() <= 1) {
            return true;
        }
        if (x.charAt(0) != x.charAt(x.length() - 1)) {
            return false;
        }
        return stringPalindrom(x.substring(1, x.length() - 1));
    }

    public static Boolean isPalindrome(String x) {
        if (x == null) {
            throw new NullInputException("Input cannot be null");
        }
        String reversed = stringReverse(x);
        return reversed.equals(x);
    }
}
