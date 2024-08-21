package org.beta.curs15.homeworkTests.exercise1;

import org.assertj.core.api.Assertions;
import org.beta.curs15.homework.exercise1.NumbersSumRecursive;
import org.beta.curs15.homework.exceptions.InvalidInputException;
import org.beta.curs15.homework.exceptions.NullInputException;
import org.junit.jupiter.api.Test;

public class NumbersSumRecursiveTest {
    @Test
    void classInit() {
        NumbersSumRecursive numbersSumRecursive = new NumbersSumRecursive();
    }

    @Test
    public void testCallFunctionSumRecursive() {
        NumbersSumRecursive numbersSumRecursive = new NumbersSumRecursive();
        Assertions.assertThat(numbersSumRecursive.numbersSum(5)).isEqualTo(10);
    }

    @Test
    void testIfParameterIsNull() {
        NumbersSumRecursive numbersSumRecursive = new NumbersSumRecursive();
        org.junit.jupiter.api.Assertions.assertThrows(NullInputException.class, () -> numbersSumRecursive.numbersSum(null));
    }

    @Test
    void testIfParameterIsLowerThanZero() {
        NumbersSumRecursive numbersSumRecursive = new NumbersSumRecursive();
        org.junit.jupiter.api.Assertions.assertThrows(InvalidInputException.class, () -> numbersSumRecursive.numbersSum(-1));
    }
}
