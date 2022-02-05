package designPrinciples;

//Open Closed Principle
//Closed for modification
public class Messaging {

    private final SocialMedia socialMedia;

    public Messaging(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }
    public void toMessageFriend(String messageToFriend){
        socialMedia.toMessage(messageToFriend);
    }


}
