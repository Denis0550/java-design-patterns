package bridge.example;

public class EmailMessageSender implements MessageSender {

    @Override
    public String sendMessage() {
        return EmailMessageSender.class + " Sending email message...";
    }
}
