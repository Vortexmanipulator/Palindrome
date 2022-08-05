package com.sparta.dr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    @DisplayName("Given the input is a palindrome return true")
    void givenTheInputIsAPalindromeReturnTrue() {
        Boolean expected = true;
        Boolean answer = StringManipulation.palindrome("hannah");
        Assertions.assertEquals(expected, answer);
    }

    @Test
    @DisplayName("Given the input has capital letters, return true")
    void givenTheInputHasCapitalLettersReturnTrue() {
        Boolean expected = true;
        Boolean answer = StringManipulation.palindrome("rAcEcAr");
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given the input is not a palindrome, return false")
    void givenTheInputIsNotAPalindromeReturnFalse() {
        Boolean expected = false;
        Boolean answer = StringManipulation.palindrome("Test");
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given the input is an empty string, return false")
    void givenTheInputIsAnEmptyStringReturnFalse() {
        Boolean expected = false;
        Boolean answer = StringManipulation.palindrome("");
        Assertions.assertEquals(expected, answer);
}

    @Test
    @DisplayName("Given a string containing multiple palindromes return palindrome with the largest length")
    void givenASentenceContainingMultiplePalindromesReturnPalindromeWithTheLargestLength() {
        String testString = "I really like my racecar, it's a honda civic, Hannah was the one that gave it to me; that gift was on another level";
        String expected = "racecar";
        String answer = StringManipulation.longestPalindrome(testString);
    }

//    @Test
//    @DisplayName("Given a string containing no palindromes return exception case")
//    void givenAStringContainingNoPalindromesReturnExceptionCase() {
//        String testString = "Hello how are you";
//        String expected = "This string does not contain any palindromes";
//        String answer = StringManipulation.longestPalindrome(testString);
//
//    }


}