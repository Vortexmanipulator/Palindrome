package com.sparta.dr;

/**
 * Hello world!
 *
 */
public class Palindrome
{
    public static void main( String[] args )
    {
//        String s = "ABCDE";
//        String t = "FGHIJK";
//        String u = s+t;

        MyStrings stringy = new MyStrings();
//        stringy.sayHello();
//        System.out.println(stringy.letterExists("i,hello"));
//        System.out.println(s.charAt(1));

//        for(int i = 0; i < s.length();i++){
//            System.out.println(s.charAt(i));
//        }
//
//        for(int i = s.length()-1; i >= 0; i--){
//            System.out.println(s.charAt(i));
//        }
        String k = "racecar";
        System.out.println(stringy.reverse("racecar"));
        System.out.println("is "+ k + " a palindrome? "+stringy.palindrome(k));
    }


}
