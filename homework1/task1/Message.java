package homework1.task1;

import java.util.Objects;

public class Message {
    private final int id;
    private final String text;

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }


    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id == message.id && Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return id + text.length();
    }
}
