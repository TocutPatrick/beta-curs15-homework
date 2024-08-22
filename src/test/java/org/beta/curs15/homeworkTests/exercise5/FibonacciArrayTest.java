package org.beta.curs15.homeworkTests.exercise5;

import org.assertj.core.api.Assertions;
import org.beta.curs15.homework.exceptions.InvalidInputException;
import org.beta.curs15.homework.exceptions.NullInputException;
import org.beta.curs15.homework.recursive.exercise5.FibonacciArray;
import org.junit.jupiter.api.Test;

public class FibonacciArrayTest {
    @Test
    void testClassInit(){
        FibonacciArray fa = new FibonacciArray();
    }

    @Test
    void testCallFunctionFibonacciNthElement(){
        FibonacciArray fa = new FibonacciArray();
        Assertions.assertThat(fa.fibonacciNthElement(5)).isEqualTo(3);
    }

    @Test
    void testIfInputIsNull(){
        FibonacciArray fa = new FibonacciArray();
        org.junit.jupiter.api.Assertions.assertThrows(NullInputException.class, () -> fa.fibonacciNthElement(null));
    }

    @Test
    void testIfInputIsInvalid(){
        FibonacciArray fa = new FibonacciArray();
        org.junit.jupiter.api.Assertions.assertThrows(InvalidInputException.class, () -> fa.fibonacciNthElement(-1));
    }

}
