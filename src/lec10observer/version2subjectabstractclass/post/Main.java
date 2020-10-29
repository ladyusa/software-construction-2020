package lec10observer.version2subjectabstractclass.post;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FacebookPage page = new FacebookPage("Master Chef"); // subject
        User kwan = new User("Kwan");
        kwan.follow(page);
        User ploy = new User("Ploy");
        ploy.follow(page);

        BackupService service = new BackupService("backup.txt", page);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            page.post(message);
        }
    }
}
