package com.keerthi.assignment;

public class Singleton {

    String stringMember;
    public static Singleton stringMember(String stringMember) {
        //this.stringMember =stringMember;
        //Static method can access only static data
        //stringMember is non-static instance variable
        Singleton object = new Singleton();
        return object;
    }
    public void printString(){
        System.out.println("String : "+ stringMember);
    }
}
