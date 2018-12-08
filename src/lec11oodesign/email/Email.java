package lec11oodesign.email;

public class Email {
    private String sender;
    private String recipient;
    private String text;

    public Email(String from, String to, String text) {
        sender = from;
        recipient = to;
        this.text = text;
    }

    public Email(String from, String to) {
        this(from, to, "");
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String format() {
        return "From: " + sender + "\n" +
                "To: " + recipient + "\n" +
                text + "\n";
    }
}

