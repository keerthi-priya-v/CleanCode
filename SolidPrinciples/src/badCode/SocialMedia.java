package com.badCode;

//Violating Open Closed Principle
//Violating Dependency Principle
public class SocialMedia {

    //SocialMedia is depending on WhatsApp and Twitter
    public void toMessageFriend(Apps apps){
        if(apps instanceof WhatsApp){
            Apps messageFriend = apps;
            //System.out.println("6...Message in WhatsApp..");
            ((WhatsApp) apps).toMessage("How R U??(Social Media - WhatsApp)");
        }
        else if(apps instanceof Twitter){
            Apps messageFriend = apps;
            //System.out.println("Message in Twitter..");
            ((Twitter) apps).toMessage("How R U??(Social Media - Twitter)");
        }
    }


}
