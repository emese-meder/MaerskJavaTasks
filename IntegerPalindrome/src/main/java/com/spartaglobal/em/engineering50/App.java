package com.spartaglobal.em.engineering50;

/*
Problem 6: Integer Palindrome
        Check if given Integer is palindrome or not. An integer is called palindrome
        if it's equal to its reverse, e.g. 1001 is a palindrome, but 1234 is not
        because the reverse of 1234 is 4321 which is not equal to 1234.
        Please write the unit tests for your solution using any of the unit testing framework.

*/

public class App 
{
    public static void main( String[] args ) {

        IntegerPalindrome integerPalindrome = new IntegerPalindrome();
        System.out.println(integerPalindrome.checkIntegerIsPalindrome(5) );
    }
}
