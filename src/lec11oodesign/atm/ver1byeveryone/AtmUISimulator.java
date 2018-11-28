package lec11oodesign.atm.ver1byeveryone;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class AtmUISimulator {

    private Bank bank;

    public AtmUISimulator() {
        bank = new Bank();
        initCustomerData();
    }

    private void initCustomerData() {
        DataSource dataSource = new DataSource("data/customers.txt");
        List<Customer> data;
        try {
            data = dataSource.readCustomers();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading account data.");
            return;
        }

        bank.addCustomers(data);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------------");
            System.out.print("Enter customer number: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter PIN: ");
            int pin = Integer.parseInt(scanner.nextLine());

            if (!bank.checkIdPin(id, pin)) {
                System.out.println("Incorrect login. Please try again.");
                continue;
            }
            else {
                System.out.println(" >> Balance : " + bank.getBalance(id));
                while (true) {
                    System.out.print("A=Deposit, B=Withdrawal, C=Transfer, D=Done, E=Exit: ");
                    String command = scanner.nextLine();

                    if (command.equalsIgnoreCase("A")) {
                        System.out.print("Amount: ");
                        double amount = Double.parseDouble(scanner.nextLine());
                        bank.deposit(id, amount);
                    }
                    else if (command.equalsIgnoreCase("B")) {
                        System.out.print("Amount: ");
                        double amount = Double.parseDouble(scanner.nextLine());
                        bank.withdraw(id, amount);
                    }
                    else if (command.equalsIgnoreCase("C")) {
                        System.out.print("Transfer To: ");
                        int id2 = Integer.parseInt(scanner.nextLine());
                        System.out.print("Amount: ");
                        double amount = Double.parseDouble(scanner.nextLine());

                        bank.transfer(id, id2, amount);
                    }
                    else if (command.equalsIgnoreCase("D")) {
                        break;
                    }
                    else if (command.equalsIgnoreCase("E")) {
                        System.exit(0);
                    }
                    else {
                        continue;
                    }
                    System.out.println(" >> Balance : " + bank.getBalance(id));

                }


            }
        }
    }
}
