package com.kozachenko.lesson.lesson7;

import java.util.Arrays;

public class StringWork {

    public static void main(String[] args) {
        String name = "lemon.school";
        String palindrome = "pop";
        int [] array = {1,2, 3,7,27};
//        for(int i = array.length-1; i >= 0 ; i--){
//            System.out.print(array[i]+"\t");
//        }

        System.out.println(isPalindromeCustom(palindrome));
    }

    private static boolean isPalindrome(String s){
        String revertedString = revertStringWithString(s);
        return revertedString.equals(s);
    }

    private static boolean isPalindromeCustom(String s){
        char [] chars = s.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length/2; i++){
            int backElementNumber = chars.length-(i+1);
            if(chars[i]==chars[backElementNumber]){
                System.out.println("before continue");
                continue;
            } else{
                System.out.println("else");
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeStringBuilder(StringBuilder buffer){
        StringBuilder revertedString = revertStringWithStringBuilder (buffer);
        return revertedString.equals(buffer);
    }

    private static String revertStringWithString(String s){
        char chars[] = s.toCharArray();
        String newS = "";
        for(int i = chars.length-1; i >= 0 ; i--){
            newS=newS + chars[i];
        }
        return newS;
    }
    private static String revertStringWithStringBuffer(String s){
        char chars[] = s.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for(int i = chars.length-1; i >= 0 ; i--){
            buffer.append(chars[i]);
        }
        return buffer.toString();
    }
    private static StringBuilder revertStringWithStringBuilder(StringBuilder s){
        char chars[] = s.toString().toCharArray();
        StringBuilder buffer = new StringBuilder();
        for(int i = chars.length-1; i >= 0 ; i--){
            buffer.append(chars[i]);
        }
        return buffer;
    }
}
