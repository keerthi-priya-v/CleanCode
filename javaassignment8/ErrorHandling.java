package com.javaassignment8;


public class ErrorHandling {

    public static void exceptionHandling(String name,String phoneNumber,String bankNumber) throws FirstException,SecondException,ThirdException
    {
        if(name.length()==0)
            throw new FirstException();
        if(phoneNumber.length()!=10)
            throw new SecondException();
        if(bankNumber.length()!=12)
            throw new ThirdException();

    }
    public static void main(String[] args) {
        try {
            exceptionHandling("keer", "1276761904809665826", "12345678");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("In finally block!!");
        }
    }
}