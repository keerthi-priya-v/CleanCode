package com.designPrinciples;


public class FollowsSolidPrinciples {

    //Liskov Substitution Principle
    static void Message(MessagingService messagingService){
        messagingService.sendTextMessage("Hello");
        messagingService.sendVoiceMessage("Voice Message");

    }
    public static void main(String[] args) {

        //Following Single Responsibility Principle
        //Object has one responsibility for Sender
        SenderDetails sender = new SenderDetails();
        sender.setSenderName("Keerthi");

        //Object has one responsibility for Receiver
        ReceiverDetails receiver = new ReceiverDetails();
        receiver.setReceiverName("Maya");
        System.out.println("Sender : "+sender.getSenderName());
        System.out.println("Receiver : "+receiver.getReceiverName());

        String i = "Hiiiiiii";
        //Follows Liskov Substitution
        //Objects of super class should be replaced with objects of sub-classes
        Message(new MessagingService());
        Message(new Hangouts());

        //Follows Interface Segregation Principle
        Instagram instagram= new Instagram();
        instagram.sendVoiceMessage(i);

        //Following Dependency Inversion Principle
        SocialMedia socialMedia = new Twitter();
        Messaging messaging = new Messaging(socialMedia);
        messaging.toMessageFriend("Hello....wassup!!");

    }

}