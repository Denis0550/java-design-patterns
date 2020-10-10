package bridge;

import bridge.example.*;
import java.util.ArrayList;

public class Bridge {

    public static void main(String[] args) {

        // Usage: Sender side
        MessageSender sender = new TextMessageSender();
        System.out.println( sender.sendMessage() );

        sender = new EmailMessageSender();
        System.out.println( sender.sendMessage() );

        final ArrayList< MessageSender > listOfSenders = new ArrayList<>();

        listOfSenders.add( new TextMessageSender() );
        listOfSenders.add( new EmailMessageSender() );

        // Usage: Message side
        listOfSenders.forEach( MessageSender::sendMessage );

        final ArrayList<Message> listOfMessages = new ArrayList<>();

        listOfMessages.add( new TextMessage( new TextMessageSender() ) );
        listOfMessages.add( new EmailMessage( new EmailMessageSender() ) );

        listOfMessages.forEach( message -> {
            System.out.println( message.send() ); } );

     }
}
