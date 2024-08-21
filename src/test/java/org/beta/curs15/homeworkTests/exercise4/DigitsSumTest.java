package org.beta.curs15.homeworkTests.exercise4;

import org.assertj.core.api.Assertions;
import org.beta.curs15.homework.exceptions.InvalidInputException;
import org.beta.curs15.homework.exceptions.NullInputException;
import org.beta.curs15.homework.exercise4.DigitsSum;
import org.junit.jupiter.api.Test;

public class DigitsSumTest {
    @Test
    void testClassInit(){
        DigitsSum ds = new DigitsSum();
    }

    @Test
    void testCallFunctionDigitSum(){
        DigitsSum ds = new DigitsSum();
        Assertions.assertThat(ds.digitSum(345)).isEqualTo(12);
    }

    @Test
    void testIfInputIsInvalid(){
        DigitsSum ds = new DigitsSum();
        org.junit.jupiter.api.Assertions.assertThrows(InvalidInputException.class, () -> ds.digitSum(-1));
    }

    @Test
    void testIfInputIsNull(){
        DigitsSum ds = new DigitsSum();
        org.junit.jupiter.api.Assertions.assertThrows(NullInputException.class, () -> ds.digitSum(null));
    }
}
