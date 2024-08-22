package org.beta.curs15.homework.recursive.exercise4;

import org.beta.curs15.homework.exceptions.InvalidInputException;
import org.beta.curs15.homework.exceptions.NullInputException;

public class DigitsSum {
    public static void main(String[] args) {
        System.out.println(digitSum(145));
    }
    public static int digitSum(Integer n){
        if(n == null){
            throw new NullInputException("Input cannot be null");
        }
        if(n < 0){
            throw new InvalidInputException("Invalid Input");
        }
        if(n == 0){
            return 0;
        }
        return n%10 + digitSum(n/10);
    }
}
