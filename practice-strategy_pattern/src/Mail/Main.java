package Mail;

public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("Kwan", "Kate", "Hello");
        Email email2 = new Email("George", "Ken", "Hi");
        EmailSystem emailSystem = new EmailSystem();

        // create mailbox of user
        emailSystem.createMailbox("Kwan");
        emailSystem.createMailbox("Kate");
        emailSystem.createMailbox("George");
        emailSystem.createMailbox("Ken");

        emailSystem.send(email1, new CaesarEncrypt(2));
        emailSystem.send(email2, new SwitchCipherEncrypt());

        emailSystem.read("Kate");
        emailSystem.read("Ken");
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
