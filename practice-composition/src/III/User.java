package III;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<Mail> mails;

    public User(String userName) {
        this.userName = userName;
        mails = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void receive(Mail mail) {
        mails.add(mail);
    }

    public void readMails() {
        for (Mail mail : mails) {
            System.out.println("---------------------------");
            System.out.println(mail);
            System.out.println("---------------------------");
        }
    }

    public boolean isUser(String userName) {
        return this.userName.equals(userName);
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
