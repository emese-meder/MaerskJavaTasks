package com.spartaglobal.em.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestIntegerPalindrome {

    IntegerPalindrome integerPalindrome = new IntegerPalindrome();

    @Test
    public void TestReturnsTrueForSingleDigitInteger(){
        assertTrue(integerPalindrome.checkIntegerIsPalindrome(6));
    }

    @Test
    public void TestReturnsFalseForNegatives(){
        assertFalse(integerPalindrome.checkIntegerIsPalindrome(-6));
    }

    @Test
    public void TestReturnsFalseForPositiveNonPalindrome(){
        assertFalse(integerPalindrome.checkIntegerIsPalindrome(87));
    }

    @Test
    public void TestReturnsTrueForZero(){
        assertTrue(integerPalindrome.checkIntegerIsPalindrome(0));
    }

    @Test
    public void TestReturnsTrueEvenDigits(){
        assertTrue(integerPalindrome.checkIntegerIsPalindrome(7777));
    }

    @Test
    public void TestReturnsTrueOddDigits(){
        assertTrue(integerPalindrome.checkIntegerIsPalindrome(777));
    }







}
