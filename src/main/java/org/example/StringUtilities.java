package org.example;

public class StringUtilities {

    // Returns true if string has fewer than 5 characters
    public static boolean shortString(String str) {
        return str.length() < 5;
    }

    // Returns the first character of the string
    public static char firstLetter(String str) {
        return str.charAt(0);
    }

    // Replaces all lowercase "asparagus" with "****"
    public static String censorAsparagus(String str) {
        return str.replace("asparagus", "****");
    }

    // Returns the longer string (if equal length, return first)
    public static String bigger(String str1, String str2) {
        if (str1.length() >= str2.length()) {
            return str1;
        } else {
            return str2;
        }
    }
}