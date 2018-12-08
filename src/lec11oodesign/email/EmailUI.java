package lec11oodesign.email;


import java.io.IOException;
import java.util.Scanner;

public class EmailUI {
    private Scanner in;

    /**
     Constructs an EmailUI object.
     */
    public EmailUI() {
        in = new Scanner(System.in);
    }

    /**
     Runs the system.
     @param system the e-mail messaging system
     */
    public void run(EmailSystem system) {

        boolean more = true;
        String currentUser = null;

        System.out.println("=========== SWCon Email System ===========");

        while (more) {
            System.out.println(
                    "Command --> Log I)n  S)end message  R)ead messages  Log O)ut  Q)uit");
            String command = in.nextLine().toUpperCase();

            if (command.equals("I")) {
                System.out.print("User name: ");
                currentUser = in.nextLine();
            }
            else if (command.equals("O")) {
                currentUser = null;
            }
            else if (command.equals("Q")) {
                more = false;
            }
            else if (command.equals("R")) {
                if (currentUser == null) {
                    System.out.println("Log in first!");
                }
                else {
                    System.out.println(system.readMessages(currentUser));
                }
            }
            else if (command.equals("S")) {
                if (currentUser == null) {
                    System.out.println("Log in first!");
                }
                else {
                    System.out.print("Enter recipient: ");
                    String to = in.nextLine();
                    System.out.print("Enter text: ");
                    String text = in.nextLine();
                    Email msg = new Email(currentUser, to, text);
                    system.send(msg);
                }
            }
        }
    }
}
