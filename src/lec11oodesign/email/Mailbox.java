package lec11oodesign.email;

import java.util.ArrayList;

public class Mailbox {
    private String user;
    private ArrayList<Email> emails;

    public Mailbox(String u) {
        user = u;
        emails = new ArrayList<Email>();
    }

    public String getUser() {
        return user;
    }

    public void addMessage(Email m) {
        emails.add(m);
    }

    public String listMessages() {
        StringBuffer messagesStr = new StringBuffer();
        for (Email msg : emails) {
            messagesStr.append(msg.format()+"---------\n");
        }
        return messagesStr.toString();
    }

}

