package org.beta.curs15.homeworkTests.exercise2;

import org.assertj.core.api.Assertions;
import org.beta.curs15.homework.exceptions.InvalidInputException;
import org.beta.curs15.homework.exceptions.NullInputException;
import org.beta.curs15.homework.exercise2.EvenNumbersSumRecursive;
import org.junit.jupiter.api.Test;

public class EvenNumbersSumRecursiveTest {
    @Test
    void testClassInit(){
        EvenNumbersSumRecursive evenNumbersSumRecursive = new EvenNumbersSumRecursive();
    }

    @Test
    void testFunctionCallEvenSum(){
        EvenNumbersSumRecursive evenNumbersSumRecursive = new EvenNumbersSumRecursive();
        Assertions.assertThat(evenNumbersSumRecursive.evenSum(3)).isEqualTo(6);
    }

    @Test
    void testIfInputIsNull(){
        EvenNumbersSumRecursive evenNumbersSumRecursive = new EvenNumbersSumRecursive();
        org.junit.jupiter.api.Assertions.assertThrows(NullInputException.class, ()-> evenNumbersSumRecursive.evenSum(null));
    }

    @Test
    void testIfInputIsInvalid(){
        EvenNumbersSumRecursive evenNumbersSumRecursive = new EvenNumbersSumRecursive();
        org.junit.jupiter.api.Assertions.assertThrows(InvalidInputException.class, () -> evenNumbersSumRecursive.evenSum(-1));
    }
}
