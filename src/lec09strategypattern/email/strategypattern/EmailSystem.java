package lec09strategypattern.email.strategypattern;

import java.util.HashMap;
import java.util.List;

public class EmailSystem {
    private HashMap<String, List<Email>> mailboxes;
    private Encryptor encryptor;

    public EmailSystem(Encryptor encryptor) {
        this.encryptor = encryptor;
        this.mailboxes = new HashMap<>();
    }

    public void send(Email m) {
        String encrypted = encryptor.encrypt(m.getText());
        m.setText(encrypted);
        // deliver to corresponding mailbox
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }
}

