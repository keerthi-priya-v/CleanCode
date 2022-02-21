package com.keerthi.assignment;

public class Data {
    int intMember;//Not initialized
    char charMember;//Not initialized

    void printMembers(){
        System.out.println("Integer Value : "+ intMember + "\tCharacter Value : "+ charMember);
    }
    void printLocalMembers(){
        int intLocalMember;//Not initialized
        char charLocalMember;//Not initialized
        //Local variables must be initialized before use, as they don’t have a default value

       // System.out.println("Local Integer Value : "+ intLocalMember + "Local Character Value : "+ charLocalMember);

    }
}
