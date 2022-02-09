package com.badCode;


public class ViolatesSolidPrinciples {

    public static void main(String[] args) {

        //Violating Single Responsibility Principle
        //Object has two responsibilities about Sender and Receiver
        SenderReceiverDetails chat = new SenderReceiverDetails();
        chat.setSenderName("Keerthi");
        chat.setReceiverName("Maya");
        System.out.println("Sender : "+chat.getSenderName());
        System.out.println("Receiver : "+chat.getReceivername());

        String i = "Hiiiiiii";

        //Liskov Substitution Principle
        MessagingService messagingService = new MessagingService();
        Hangouts hangouts = new Hangouts();
        Instagram instagram= new Instagram();

        messagingService.sendTextMessage("Yooo");
        messagingService.sendVoiceMessage("Voice Message");

        hangouts.sendTextMessage("Heyyyy");
        hangouts.sendVoiceMessage("Voice Message");

        instagram.sendVoiceMessage(i);

        //Violates Dependency Inversion Principle
        SocialMedia socialMedia = new SocialMedia();
        WhatsApp whatsApp = new WhatsApp();

        socialMedia.toMessageFriend(whatsApp);

    }

}
