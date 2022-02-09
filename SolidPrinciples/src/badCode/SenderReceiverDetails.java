package com.badCode;

//Violating Single Responsibility Principle
public class SenderReceiverDetails {

    String senderName;
    String receivername;

    //setters
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setReceiverName(String receiverName) {
        this.receivername = receiverName;
    }
    //getters
    public String getSenderName(){
        return senderName;
    }

    public String getReceivername() {
        return receivername;
    }
}
