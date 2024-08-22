package org.beta.curs15.homeworkTests.exercise3;

import org.assertj.core.api.Assertions;
import org.beta.curs15.homework.exceptions.NullInputException;
import org.beta.curs15.homework.recursive.exercise3.PalindromRecursiveReversed;
import org.junit.jupiter.api.Test;

public class PalindromRecursiveReversedTest {
    @Test
    void testInitClass(){
        PalindromRecursiveReversed palindromRecursiveReversed = new PalindromRecursiveReversed();
    }

    @Test
    void testCallFunctionStringReverse(){
        PalindromRecursiveReversed palindromRecursiveReversed = new PalindromRecursiveReversed();
        Assertions.assertThat(palindromRecursiveReversed.stringReverse("ana")).isEqualTo("ana");
    }

    @Test
    void testCallFunctionIsPalindrome(){
        PalindromRecursiveReversed palindromRecursiveReversed = new PalindromRecursiveReversed();
        Assertions.assertThat(palindromRecursiveReversed.isPalindrome("ana")).isEqualTo(true);
    }

    @Test
    void testIfInputIsNull(){
        PalindromRecursiveReversed palindromRecursiveReversed = new PalindromRecursiveReversed();
        org.junit.jupiter.api.Assertions.assertThrows(NullInputException.class, () -> palindromRecursiveReversed.isPalindrome(null));
    }

    @Test
    void testFunctionCallStringPalindrom(){
        PalindromRecursiveReversed palindromRecursiveReversed = new PalindromRecursiveReversed();
        Assertions.assertThat(palindromRecursiveReversed.stringPalindrom("ana")).isEqualTo(true);
    }

    @Test
    void testIfInputIsNullForStringPalindrom(){
        PalindromRecursiveReversed palindromRecursiveReversed = new PalindromRecursiveReversed();
        org.junit.jupiter.api.Assertions.assertThrows(NullInputException.class, () -> palindromRecursiveReversed.stringPalindrom(null));
    }
}
