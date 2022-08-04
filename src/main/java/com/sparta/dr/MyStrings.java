package com.sparta.dr;

public class MyStrings {
    public void sayHello(){

        System.out.println("Hello");
    }

    public String reverse(String stringToReverse){
        String a = "";
        for(int i = stringToReverse.length()-1; i >= 0; i--){

            a += stringToReverse.charAt(i);
        }

        return a;
    }

    public static Boolean palindrome(String checkPalindrome){
        String a = "";

        checkPalindrome = checkPalindrome.toLowerCase();
        for(int i = checkPalindrome.length()-1; i >= 0; i--){

            a += checkPalindrome.charAt(i);
        }
        if(checkPalindrome.equals(a)){
//             isPalindrome = true;
            return true;
        }
        else {
            return false;
        }

    }

    public boolean letterExists(String strIn, String StrSearch){

        return true;
    }


}
