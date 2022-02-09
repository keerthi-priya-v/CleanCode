package com.designPrinciples;

//Following Single Responsibility Principle
//ReceiverDetails has only one responsibility
public class ReceiverDetails {

    String receiverName;

    //setters
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    //getters
   public String getReceiverName() {
        return receiverName;
    }

}
