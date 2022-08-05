package com.sparta.dr;

public class MyStrings {
    public static String reverse(String stringToReverse) {
        String a = "";
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {

            a += stringToReverse.charAt(i);
        }
        return a;
    }

    public static Boolean palindrome(String checkPalindrome) {
        checkPalindrome = checkPalindrome.toLowerCase();
        String a = reverse(checkPalindrome);

        if (checkPalindrome.equals(a) && checkPalindrome != "") {
            return true;
        } else {
            return false;
        }

    }
}

