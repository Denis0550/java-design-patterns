package bridge.example;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Message {

    MessageSender messageSender;
    public abstract String send();

}
