package ru.itis.protocol.message;

import lombok.AllArgsConstructor;
import ru.itis.constants.MessageTypes;

@AllArgsConstructor
public class ServerMessage extends Message<String> {

    private final String content;
    private final int senderId;

    @Override
    public MessageTypes getType() {
        return MessageTypes.SYSTEM_MESSAGE;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public int getSenderId() {
        return senderId;
    }
}