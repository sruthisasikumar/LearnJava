package com.chap5;

import java.util.Scanner;

public class StringExample {

    public static void main(String args[]) {
        // Take input from keyboard.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please tell me your full name: <FirstName><space><LastName>");
        String name = sc.nextLine();

        System.out.println("What is your year of birth: ");
        int year = sc.nextInt();
        int age = 2017 - year;

        System.out.println("Hi "+ name + "!!! So your age is " + age);

        // Consider a string "Encyclopedia"
        // what is the length of the String.
        String example = "Encyclopedia";
        String ex2 = "Encyclopedia";
        String ex3 = "EncycLopedia";

        System.out.println("Length of String is : "+example.length()); // 12
        System.out.println("Convert the string to upper case : "+example.toUpperCase()); // ENCYCLOPEDIA
        System.out.println("Convert the string to lower case : "+example.toLowerCase()); // encyclopedia

        // Character array is pronounced as String in object oriented programming.
        System.out.println("Get the last 4 characters of string : "+example.substring(8)); // edia
        System.out.println("Get the last 4 characters of string (dynamic): "+example.substring(example.length()-4)); // edia
        System.out.println("Get the 4th character of the string: "+example.charAt(3)); // y
        System.out.println("Get the first occurance of 'l' in the text: "+example.indexOf('l')); // 5
        System.out.println("Is example and ex2 the same : "+example.equals(ex2)); // true
        System.out.println("Is example and ex3 the same : "+example.equals(ex3)); // false
        System.out.println("Is example and ex3 the same ignoring case : "+example.equalsIgnoreCase(ex3)); // true

        // String concat
        String one = "My name is ";
        System.out.println(one.concat(name)); // My name is Sruthi Sasikumar
        // concat is same as using + operator

        // trim function
        System.out.println(one+"-"+name); // My name is -Sruthi Sasikumar
        System.out.println(one.trim()+"-"+name); // My name is-Sruthi Sasikumar

        String item1 = "ball";
        String item2 = "dog";
        String item3 = "apple";
        // compare the strings. dictionary order is followed if the first string comes before the second negative
        // if the first string comes after the second positive
        // if the first string equals to second string 0

        System.out.println(item1.compareTo(item2)); // negative
        System.out.println(item1.compareTo(item3)); // positive
        System.out.println(item1.compareTo("ball")); // 0
        System.out.println(item1.compareTo("Ball")); // positive because ASCII lower case comes after ASCII upper case.


        // Regular expressions \n, \t, \s
        String line = "My name is Sruthi.\nI am at Sydney.\tIt is cold in here.";
        System.out.println(line);

        // Split string
        String[] nameSplit = name.split(" "); // This gives an array of string with each array element as a split.
        System.out.println("length of your name is :"+nameSplit.length+" words");
        System.out.println("Your first name is : "+nameSplit[0]);
        System.out.println("Your last name is : "+nameSplit[1]);
        String[] nameSplit1 = name.split("\\s"); // another way of giving space as delimeter
        System.out.println("length of your name is :"+nameSplit1.length+" words");
        System.out.println("Your first name is : "+nameSplit1[0]);
        System.out.println("Your last name is : "+nameSplit1[1]);

        System.out.println("Does your name start with Sru : "+name.startsWith("Sru")); // true
        System.out.println("Does your name start with sru : "+name.startsWith("sru")); // false
        System.out.println("Does your name end with ar : "+name.endsWith("ar")); // true

        // Replace
        String test = "Sruthi is from India. Sruthi is learning Java.";
        String newName = "Aaron";
        System.out.println(test.replaceAll("Sruthi", newName));

        // Integer to String conversion

        int val = 10;
        System.out.println(String.valueOf(10).getClass());
    }

}
