package com.designPrinciples;

//Liskov Substitution
//Objects of super class should be replaced with objects of sub classes
public class MessagingService implements TextMessage,VoiceMessage {

    public void sendTextMessage(String textMessageToFriend) {
        System.out.println("1...Text Message from Messaging Services : " + textMessageToFriend);
    }
    //Interface Segregation
    public void sendVoiceMessage(String voiceMessageToFriend) {
        System.out.println("2...Voice Message from  Messaging Services : "+ voiceMessageToFriend);
    }
}
