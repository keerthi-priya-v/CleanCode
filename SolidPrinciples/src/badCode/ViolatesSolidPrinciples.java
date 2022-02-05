package badCode;


public class ViolatesSolidPrinciples {

    public static void main(String[] args) {
        String i = "Hiiiiiii";
        //System.out.println("1");
        MessagingService messagingService = new MessagingService();
        Hangouts hangouts = new Hangouts();
        Instagram instagram= new Instagram();
        messagingService.sendTextMessage("Yooo");
        messagingService.sendVoiceMessage("Voice Message");
        hangouts.sendTextMessage("Heyyyy");
        hangouts.sendVoiceMessage("Voice Message");
        instagram.sendVoiceMessage(i);
        //Violates Dependency Inversion
        SocialMedia socialMedia = new SocialMedia();
        WhatsApp whatsApp = new WhatsApp();
        socialMedia.toMessageFriend(whatsApp);

    }

}
