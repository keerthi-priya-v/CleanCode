package com.designPrinciples;

//Following Single Responsibility Principle
//SenderDetails has only one responsibility
public class SenderDetails {
    String senderName;

    //setters
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    //getters
    public String getSenderName(){
        return senderName;
    }

}
