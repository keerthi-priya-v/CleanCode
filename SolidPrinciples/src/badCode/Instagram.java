package com.badCode;

public class Instagram implements SendMessage{

    //Violating Interface Segregation
    public void sendTextMessage(String textMessageToFriend) {
        System.out.println("Not Valid in Instagram!!!");
}

    public void sendVoiceMessage(String messageToFriend) {
        System.out.println("5...Messaging from Instagram :  " + messageToFriend);
    }
}
