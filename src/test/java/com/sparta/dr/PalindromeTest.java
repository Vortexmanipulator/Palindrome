package com.sparta.dr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    @DisplayName("Given the input is a palindrome return true")
    void givenTheInputIsAPalindromeReturnTrue() {
        Boolean expected = true;
        Boolean answer = MyStrings.palindrome("hannah");
        Assertions.assertEquals(expected, answer);
    }

    @Test
    @DisplayName("Given the input has capital letters, return true")
    void givenTheInputHasCapitalLettersReturnTrue() {
        Boolean expected = true;
        Boolean answer = MyStrings.palindrome("rAcEcAr");
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given the input is not a palindrome, return false")
    void givenTheInputIsNotAPalindromeReturnFalse() {
        Boolean expected = false;
        Boolean answer = MyStrings.palindrome("Test");
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given the input is an empty string, return false")
    void givenTheInputIsAnEmptyStringReturnFalse() {
        Boolean expected = false;
        Boolean answer = MyStrings.palindrome("");
        Assertions.assertEquals(expected, answer);
}


}