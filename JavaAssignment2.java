package com;

import java.util.Scanner;

public class JavaAssignment2 {
    public static void main(String[] args){

        String str;
        int index;
        int flag = 0;
        //Array to set value if the letter appears
        int[] array = new int[26];
        System.out.print("---- Enter String ---\t");
        //Input object to take input
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        //Converting the input string to lowercase
        str = str.toLowerCase();
        //Checking for alphabet
        for( int i = 0 ; i < str.length() ; i++ ){
            index = str.charAt(i)-'a';
            //Incrementing if found an alphabet
            array[index] = array[index] + 1;
        }
        //Traversing the array to check values
        for(int i = 0 ; i < 26 ; i++ ){
            //If the value is 0 break
            if(array[i]==0){
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("Input String contains all the letters of the alphabet a-z");
        else
            System.out.println("Input String does not contain all the letters of the alphabet a-z");
        //The time complexity of the program is O(length of the String)
        //The space complexity of the program is O(1)
    }
}
