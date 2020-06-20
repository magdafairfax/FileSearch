package com;

public class Palindrome {

    public boolean isPalidromeUsingStringBuffer(String givenString) {
        boolean isPalindrome = true;
        String clean = givenString.replaceAll("\\s+", "").toLowerCase();
        StringBuffer plain = new StringBuffer(clean);
        StringBuffer reverse = plain.reverse();
        isPalindrome = (reverse.toString()).equals(clean);

        return isPalindrome;
    }

    public static  void main (String[] args){
        Palindrome palindrome = new Palindrome();
        palindrome.isPalidromeUsingStringBuffer("Was it a rat I saw");
    }
}
