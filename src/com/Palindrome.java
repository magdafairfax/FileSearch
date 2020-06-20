package com;

public class Palidrome {

    public boolean isPalidromeUsingStringBuffer(String givenString) {
        String clean = givenString.replaceAll("\\s+", "").toLowerCase();

        StringBuffer plain = new StringBuffer(clean);
        StringBuffer reverse = plain.reverse();
        return (reverse.toString()).equals(plain);
    }
}
