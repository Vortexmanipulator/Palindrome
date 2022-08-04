package com.sparta.dr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    @DisplayName("Given the input has capital letters, return palindrome correctly")
    void capitalLetters() {
        Boolean expected = true;
        Boolean answer = MyStrings.palindrome("rAcEcar");
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given the input is not a palindrome, return false")
    void notPalindrome() {
        Boolean expected = false;
        Boolean answer = MyStrings.palindrome("Test");
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given the input is null, return false")
    void nullValue() {
        Boolean expected = false;
        Boolean answer = MyStrings.palindrome("");
        Assertions.assertEquals(expected, answer);

}

    @Test
    @DisplayName("Test name")
    void methodName() {

        org.junit.jupiter.api.Assertion
    }




}