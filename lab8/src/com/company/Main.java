package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CustomString customString = new CustomString();

        System.out.println(customString.searchPosition("Hello world", 'o'));
        System.out.println(customString.searchPosition("Hello world", 2));
        System.out.println(customString.compare("Hello world", "hello world"));
        System.out.println(customString.compareIgnoreReg("Hello world", "hello world"));
        System.out.println(customString.startWith("Hello world", "Hello"));
        System.out.println(customString.endWith("Hello world", "world"));
        System.out.println(customString.lastPosition("Hello world world world", "world"));
        System.out.println(customString.replaceSubstr("Hello world", "world", "Andre"));
        System.out.println(customString.getWordsNumber("Hello,friend-What is your name?"));
    }
}