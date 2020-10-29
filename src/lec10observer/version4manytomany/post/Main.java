package lec10observer.version4manytomany.post;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FacebookPage chefPage = new FacebookPage("Master Chef"); // subject
        FacebookPage runPage = new FacebookPage("Running for Life"); // subject
        StockExchangeOfThailand set = new StockExchangeOfThailand(); // subject

        User kwan = new User("Kwan");
        kwan.follow(chefPage);
        kwan.follow(runPage);
        kwan.follow(set);

        User ploy = new User("Ploy");
        ploy.follow(chefPage);

        BackupService chefBK = new BackupService("backup-chef.txt", chefPage);
        BackupService setBK = new BackupService("backup-set.txt", set);

        Scanner scanner = new Scanner(System.in);
        double price = 0;
        while (true) {
            String message = scanner.nextLine();
            chefPage.post("ChefPage: " + message);
            message = scanner.nextLine();
            runPage.post("RunPage: " + message);

            set.updateStock("KU", price++);
        }
    }
}
