package III;

public class Mail {
    private String content;
    private String sender;
    private String receiver;

    public Mail (String content, String sender, String receiver) {
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "From: " + sender + "\nTo: " + receiver + "\n" + content;
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
