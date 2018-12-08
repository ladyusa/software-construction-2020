package lec11oodesign.email;

import java.util.ArrayList;

public class EmailSystem {
    private ArrayList<Mailbox> mailboxes;

    public EmailSystem() {
        mailboxes = new ArrayList<Mailbox>();
    }

    public void send(Email m) {
        Mailbox box = find(m.getRecipient());
        box.addMessage(m);
    }

    public String readMessages(String user) {
        Mailbox box = find(user);
        return box.listMessages();
    }

    /**
     Finds a mailbox or creates a new one if none existed for
     the given user.
     @param user the user
     @return the mailbox of the user
     */
    private Mailbox find(String user) {
        for (Mailbox m : mailboxes) {
            if (m.getUser().equals(user)) {
                return m;
            }
        }

        Mailbox m = new Mailbox(user);
        mailboxes.add(m);
        return m;
    }
}

