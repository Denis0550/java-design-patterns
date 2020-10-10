package bridge.example;

public class EmailMessage extends Message {

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
        System.out.println( "Construct::"  + this.getClass() );
    }

    @Override
    public String send() {
        return messageSender.sendMessage();
    }
}
