package com;

//To access Files and File attributes
import java.io.File;
//To read input from the keyboard
import java.util.Scanner;

class JavaAssignment1
{
    public static void main(String[] args)
    {
        String inputFileName;
        int flag;
        //File object is created by passing the path
        File file = new File("\\C:\\Users\\Keerthi\\Desktop");
        System.out.print("---- Enter File Name --- Press 1 to exit program ----\t");
        //Scanner object is created
        Scanner input = new Scanner(System.in);
        //starts do-while loop
        do {
            //Flag initialised
            flag=0;
            //File name given as input
            inputFileName=input.nextLine();
            //Returns an array of string denoting the files in a given pathname
            String[] fileList =file.list();
            for(String fileName:fileList)
            {
                //Checking whether the input file name present in the array or not
                if(fileName.equals(inputFileName))
                {
                    System.out.print(fileName+ " File found :) ");
                    //Printing the absolute path of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                    System.out.print("---- Enter File Name --- Press 1 to exit program ----\t");
                    //Flag set to take the input again
                    flag=1;
                }
            }
            //Checking whether the file is not found and given input is other than 1
            if(flag==0 && !inputFileName.equals("1")) {
                System.out.print("Try again... File Not Found :( ---- Press 1 to exit program ----\t");
                //Flag set to take the input again
                flag=1;
            }
            //If the given input is 1 then exit program
            if(inputFileName.equals("1")){
                //Flag set to 0
                //Breaks do-while loop
                flag=0;
            }
        }while (flag!=0);//ends do-while
    }
}
