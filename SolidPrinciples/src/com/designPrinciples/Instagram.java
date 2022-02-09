package com.designPrinciples;

//Interface Segregation Principle

public class Instagram implements VoiceMessage{

    public void sendVoiceMessage(String messageToFriend) {
        System.out.println("5...Messaging from Instagram :  " + messageToFriend);
    }
}
