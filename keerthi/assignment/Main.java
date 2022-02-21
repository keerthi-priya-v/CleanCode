package com.keerthi.assignment;

public class Main {
    public static void main(String[] args){

        Data data =  new Data();
        data.printMembers();
        data.printLocalMembers();
        Singleton singleton = new Singleton();
        singleton.stringMember("Java");
        singleton.printString();

    }
}
