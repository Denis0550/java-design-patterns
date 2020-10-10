package bridge.example;

public class TextMessageSender implements MessageSender {

    @Override
    public String sendMessage() {
       return TextMessageSender.class + " Sending text message...";
    }
}
