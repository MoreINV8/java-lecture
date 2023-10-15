package Mail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmailSystem {
    private HashMap<String, List<Email>> mailboxes;

    public EmailSystem() {
        mailboxes = new HashMap<>();
    }

    public void createMailbox(String userName) {
        mailboxes.put(userName, new ArrayList<>());
    }

    public void send(Email m, Encryptor encryptor) {
        // encrypt
        String encryptText = encryptor.encrypt(m.getText());
        m.setText(encryptText);
        // deliver to corresponding mailbox
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }

    public void read(String user) {
        for (Email email : mailboxes.get(user)) {
            System.out.println("sender: " + email.getSender());
            System.out.println("receiver: " + email.getRecipient());
            System.out.println("text: " + email.getText());
            System.out.println("-------------------");
        }
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
