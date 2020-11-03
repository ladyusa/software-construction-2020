package lec11composition.atm;

import java.util.Scanner;

/**
   A text-based simulation of an automatic teller machine.
 */
public class AtmUI {

	private ATM atm;

	public AtmUI(ATM atm) {
		this.atm = atm;
	}

	public void run() {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("Enter customer number: ");
			int number = in.nextInt();
			System.out.print("Enter PIN: ");
			int pin = in.nextInt();
			String name = atm.validateCustomer(number, pin);

			if (name != null) {
				System.out.println("----- Welcome " + name + " -----");
				System.out.println("    Balance=" + atm.getBalance());
				System.out.print("A=Deposit, B=Withdrawal, C=Transfer, D=Done, E=Exit: ");
				String command = in.next();

				while (!command.equalsIgnoreCase("D")) {
					if (command.equalsIgnoreCase("A")) {
						System.out.print("    Amount: ");
						double amount = in.nextDouble();
						atm.deposit(amount);
					}
					else if (command.equalsIgnoreCase("B")) {
						System.out.print("    Amount: ");
						double amount = in.nextDouble();
						atm.withdraw(amount);
					}
					else if (command.equalsIgnoreCase("C")) {
						System.out.print("    Transfer To: ");
						int transferTo = in.nextInt();
						System.out.print("    Amount: ");
						double amount = in.nextDouble();
						atm.transfer(transferTo, amount);
					}
					else if (command.equalsIgnoreCase("E"))
						System.exit(0);
					else
						System.out.println("Illegal input!");

					System.out.println("    Balance=" + atm.getBalance());
					System.out.print("A=Deposit, B=Withdrawal, C=Transfer, D=Done, E=Exit: ");
					command = in.next();
				}
				atm.end();
				System.out.println("------------------------------");
			}
		}
	}
}

