package bridge.test;

import bridge.example.EmailMessage;
import bridge.example.EmailMessageSender;
import bridge.example.TextMessage;
import bridge.example.TextMessageSender;
import org.junit.jupiter.api.Test;

public class TestBridge {

    @Test
    public void testForAccess() {

        new TextMessage( new TextMessageSender() );
        new EmailMessage( new EmailMessageSender() );
    }

}
