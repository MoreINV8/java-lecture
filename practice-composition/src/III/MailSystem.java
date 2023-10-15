package III;

import java.util.ArrayList;
import java.util.List;

public class MailSystem {
    private List<User> users;

    public MailSystem() {
        users = new ArrayList<>();
    }

    public void createUser(String userName) {
        users.add(new User(userName));
    }

    public void sendMail(String content, User sender, User receiver) {
        Mail mail = new Mail(content, sender.getUserName(), receiver.getUserName());
        receiver.receive(mail);
        System.out.println("Email to " + receiver.getUserName() + " is Sent");
    }

    public void readMail(User user) {
        user.readMails();
    }

    public User findUserByName(String userName) {
        for (User user : users) {
            if (user.isUser(userName)) {
                return user;
            }
        }
        return null;
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
