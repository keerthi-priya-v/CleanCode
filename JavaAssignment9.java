package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaAssignment9 {

    public static void main(String[] args) {

        int flag1;
        int flag2;
        String regexBegin = "^[A-Z]";
        String regexEnd = "([1-30]-[1-12]-[1-9]{4})$";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 input strings: ");
        String input;
        input = sc.nextLine();
        //Creating a Pattern object
        Pattern p1 = Pattern.compile(regexBegin);
        Pattern p2 = Pattern.compile(regexEnd);
        //Creating a Matcher object
        Matcher m1 = p1.matcher(input);
        Matcher m2 = p2.matcher(input);
        if(m1.find() && m2.find())
            System.out.println("String starts with a capital letter and ends with period");

        else
            System.out.println("String does not starts with a capital letter and does not ends with period");




    }
}