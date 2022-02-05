package designPrinciples;

public class WhatsApp implements SocialMedia{

    public void toMessage(String messageToFriend){
        System.out.println("Message from Whatsapp"+ messageToFriend);
    }
}
