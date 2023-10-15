package III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(streamReader);

        MailSystem system = new MailSystem();
        system.createUser("usa");
        system.createUser("ruj");
        system.createUser("saac");

        String input;
        User currentUser = null;

        System.out.println("=========== SWCon Email System ===========");
        try {
            while (true) {
                System.out.print("------> Command [Log I)n S)end R)ead Log O)ut Q)uit]:");
                input = buffer.readLine();
                if (input.equals("I")) {

                    System.out.print("Username: ");
                    input = buffer.readLine();
                    currentUser = system.findUserByName(input);

                    if (currentUser == null) {
                        System.out.println("Has no this user name in system...");
                    }

                } else if (input.equals("Q")) {
                    System.out.println("=========== Good Bye ! ===========");
                    break;
                } else if (currentUser != null) {
                    if (input.equals("S") && currentUser != null) {

                            System.out.print("Enter recipient: ");
                            String receiverName = buffer.readLine();
                            User receiver = system.findUserByName(receiverName);

                            if (receiver != null) {
                                System.out.print("Enter text: ");
                                String content = buffer.readLine();
                                system.sendMail(content, currentUser, receiver);
                            } else {
                                System.out.println("Has no receiver in system...");
                            }

                    } else if (input.equals("R")) {

                        currentUser.readMails();

                    } else if (input.equals("O")) {

                        currentUser = null;

                    } else {

                        System.out.println("Error input...");

                    }
                } else {
                    System.out.println("You didn't login...");
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
