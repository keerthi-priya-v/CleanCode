package designPrinciples;


public class FollowsSolidPrinciples {
    static void Message(MessagingService messagingService){
        messagingService.sendTextMessage("Hello");
        messagingService.sendVoiceMessage("Voice Message");
        //System.out.println("2");
    }
    public static void main(String[] args) {
        String i = "Hiiiiiii";
        //System.out.println("1");
        Message(new MessagingService());
        Message(new Hangouts());
        Instagram instagram= new Instagram();
        instagram.sendVoiceMessage(i);
        //Dependency Inversion
        SocialMedia socialMedia = new Twitter();
        Messaging messaging = new Messaging(socialMedia);
        messaging.toMessageFriend("Hello....wassup!!");

    }

}