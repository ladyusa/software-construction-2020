package lec09strategypattern.email.nopattern;

import java.util.HashMap;
import java.util.List;

public class EmailSystem {
    private HashMap<String, List<Email>> mailboxes;

    public void sendCaesar(Email m, int key) {

        // encrypt
        char[] data = m.getText().toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(data[i] + key);
        }
        m.setText(new String(data));

        // deliver to corresponding mailbox
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }

    public void sendSwitchCipher(Email m) {
        // encrypt
        char[] data = m.getText().toCharArray();
        for (int i = 0; i < data.length-1; i += 2) {
            char tmp = data[i];
            data[i] = data[i+1];
            data[i+1] = tmp;
        }
        m.setText(new String(data));

        // deliver to corresponding mailbox
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }
}

