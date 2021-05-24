package com.company;

import java.util.Locale;

public class CustomString {
    public int searchPosition(String str, char letter) {
        return str.indexOf(letter);
    }

    public char searchPosition(String str, int pos) {
        return str.charAt(pos);
    }

    public boolean compare(String str1, String str2) {
        return str1.equals(str2);
    }

    public boolean compareIgnoreReg(String str1, String str2) {
        return str1.toLowerCase(Locale.ROOT).equals(str2.toLowerCase(Locale.ROOT));
    }

    public boolean startWith(String str, String starts) {
        return str.startsWith(starts);
    }

    public boolean endWith(String str, String ends) {
        return str.endsWith(ends);
    }

    public int lastPosition(String str, String substr) {
        return str.lastIndexOf(substr);
    }

    public String replaceSubstr(String str, String oldSubstr, String newSubstr) {
        return str.replaceAll(oldSubstr, newSubstr);
    }

    public int getWordsNumber(String str) {
        return str.replaceAll(",", " ").replaceAll("-", " ").split(" ").length;
    }
}