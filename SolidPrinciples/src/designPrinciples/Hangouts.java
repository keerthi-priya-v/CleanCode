package designPrinciples;

public class Hangouts extends MessagingService{

    public void sendTextMessage(String textMessageToFriend) {
        System.out.println("3...Sending text message from Hangouts "+ textMessageToFriend);
    }
    public void sendVoiceMessage(String voiceMessageToFriend) {
        System.out.println("4...Sending voice message from Hangouts "+ voiceMessageToFriend);
    }
}

