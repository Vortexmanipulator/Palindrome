package com.sparta.dr;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class StringManipulation {
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

        if (checkPalindrome.equals(a) && checkPalindrome != "" && checkPalindrome.length()>1) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<String> findAllPalindromes(String findAllPalindromes){
        String[] splitString = findAllPalindromes.split(" |,");
        ArrayList<String> onlyPalindromes = new ArrayList<String>();

        for (int i = 0; i < splitString.length; i++) {
            if(StringManipulation.palindrome(splitString[i]) == true){
                onlyPalindromes.add(splitString[i]) ;

            }

        }
        return onlyPalindromes;
    }

    private static ArrayList<String> arraySort(String palindromesToSort){
        ArrayList<String> sortedPalindromes = StringManipulation.findAllPalindromes(palindromesToSort);
        for (int i = 0; i < sortedPalindromes.size() -1; i++) {
            for (int j = 0; j < sortedPalindromes.size() -1; j++) {
                if(sortedPalindromes.get(j).length() > sortedPalindromes.get(j + 1).length()){
                    String temp = sortedPalindromes.get(j);
                    sortedPalindromes.set(j, sortedPalindromes.get(j+1));
                    sortedPalindromes.set(j + 1,temp);
                }
            }
        }
        return sortedPalindromes;
    }


    public static String longestPalindrome(String sortedPalindromes){
         ArrayList<String> sortedPalindrome;
         sortedPalindrome = StringManipulation.arraySort(sortedPalindromes);
         return sortedPalindrome.get(sortedPalindrome.size()-1);
    }

}

//"I really like my racecar, it's a honda civic, Hannah was the one that gave it to me; that gift was on another level" - initial test case