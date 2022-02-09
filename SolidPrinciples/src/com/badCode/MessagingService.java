package com.badCode;

public class MessagingService implements SendMessage {

    public void sendTextMessage(String textMessageToFriend) {
        System.out.println("1...Text Messaging from Messaging Services : " + textMessageToFriend);
    }
    //Interface Segregation
    public void sendVoiceMessage(String voiceMessageToFriend) {
        System.out.println("2...Voice Messaging from  Messaging Services : "+ voiceMessageToFriend);
    }
}
