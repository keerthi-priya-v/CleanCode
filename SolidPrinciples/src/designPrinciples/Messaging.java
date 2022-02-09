package com.designPrinciples;

//Follows Dependency Inversion Principle
//High level modules should not depend on low level modules, instead they should depend on abstractions

public class Messaging {

    private final SocialMedia socialMedia;

    public Messaging(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }
    public void toMessageFriend(String messageToFriend){
        socialMedia.toMessage(messageToFriend);
    }


}
