package badCode;

//Violating Interface Segregation

public interface SendMessage {

    public void sendTextMessage(String textMessageToFriend);
    public void sendVoiceMessage(String voiceMessageToFriend);

}

