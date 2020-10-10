package bridge.example;

public class TextMessage extends Message {

    public TextMessage(MessageSender messageSender) {
        super(messageSender);
        System.out.println( "Construct::"  + this.getClass() );
    }

    @Override
    public String send() {
        return messageSender.sendMessage();
    }
}
