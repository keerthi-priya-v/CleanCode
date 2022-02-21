package com;

//To access Files and File attributes
import java.io.File;
//To read input from the keyboard
import java.util.Scanner;
//Provides Matcher and Pattern classes
import java.util.regex.*;

class JavaAssignment1
{
    //File object is created by passing the path
    static File file = new File("\\C:\\Users\\Keerthi\\Desktop");

    public static void printAbsolutePath(File file, Pattern pattern){
        //Returns an array of Files denoting the files in a given pathname
        File[] fileList =file.listFiles();
        for(File fileName : fileList)
        {
            //Checking whether the input file name is directory or not
            if(fileName.isDirectory()) {
                //Recursive call
                printAbsolutePath(fileName, pattern);
            }
            else{
                //Performs match operations on a character sequence by interpreting a Pattern.
                Matcher matcher = pattern.matcher(fileName.getName());
                //Find the next subsequence of the input sequence
                if(matcher.find())
                    //Printing the Absolute path
                    System.out.println("Path : " + fileName.getAbsolutePath());
            }
        }

    }
    public static void main(String[] args)
    {
        while(true){
            //Scanner object is created
            Scanner input = new Scanner(System.in);
            System.out.println("---- Enter File Name --- Press 1 to exit program ----\t");
            //File name given as input
            String inputFileName=input.nextLine();
            //If the given input is 1 then exit program
            if(inputFileName.equals("1")){
                //Breaks while loop
                return;
            }
            //Creating pattern with given input
            Pattern pattern = Pattern.compile(inputFileName, Pattern.CASE_INSENSITIVE);
            printAbsolutePath(file, pattern);
        }//ends while
    }

}
