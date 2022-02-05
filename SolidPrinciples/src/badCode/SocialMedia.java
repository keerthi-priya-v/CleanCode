package badCode;

//Violating Open Closed Principle
public class SocialMedia {

    public void toMessageFriend(Apps apps){
        if(apps instanceof WhatsApp){
            Apps messageFriend = apps;
            System.out.println("6...Message in WhatsApp..");
        }
        else if(apps instanceof Twitter){
            Apps messageFriend = apps;
            System.out.println("Message in Twitter..");
        }
    }


}
