package lec11composition.atm.ver2bigjavabook.model;

/**
 * An ATM that accesses a bank.
 */
public class ATM {
	public static final int START = 1;
	public static final int TRANSACT = 2;

	private int state;
	private int customerNumber;
	private Customer currentCustomer;
	private Account currentAccount;
	private Bank bank;

	/**
     * Constructs an ATM for a bank.
	 */
	public ATM(Bank bank) {
		this.bank = bank;
		this.customerNumber = -1;
		this.currentAccount = null;
		this.state = START;
	}

	/**
     * Resets the ATM to the initial state.
	 */
	public void reset() {
		customerNumber = -1;
		currentAccount = null;
		state = START;
	}

	/**
     * Finds customer in bank.
     * If found sets state to ACCOUNT, else to START.
     * (Precondition: state is PIN)
	 * @param customerNum current customer number
     * @param pin pin being inputted
	 */
	public void validateCustomer(int customerNum, int pin) {
		assert state == START;

		if (bank.findCustomer(customerNum) != null &&
				bank.findCustomer(customerNum).match(pin)) {
			customerNumber = customerNum;
			currentCustomer = bank.findCustomer(customerNumber);
			currentAccount = currentCustomer.getAccount();
			state = TRANSACT;
		}
	}

	/**
     * Withdraws amount from current account.
     * (Precondition: state is TRANSACT)
     * @param value the amount to withdraw
	 */
	public void withdraw(double value) {
		assert state == TRANSACT;
		currentAccount.withdraw(value);
	}

	/**
     * Deposits amount to current account.
     * (Precondition: state is TRANSACT)
     * @param value the amount to deposit
	 */
	public void deposit(double value) {
		assert state == TRANSACT;
		currentAccount.deposit(value);
	}

	/**
     * Gets the balance of the current account.
     * (Precondition: state is TRANSACT)
     * @return the balance
	 */
	public double getBalance() {
		assert state == TRANSACT;
		return currentAccount.getBalance();
	}

	/**
	 * Transfer from current customer to the customer with
	 * customer number in the parameter
	 * @param customerNum receiver customer
	 * @param amount amount to be transferred
	 */
	public void transfer(int customerNum, double amount) {
		assert state == TRANSACT;
		Customer receivingCustomer = bank.findCustomer(customerNum);
		Account receivingAccount = receivingCustomer.getAccount();
		currentAccount.withdraw(amount);
		receivingAccount.deposit(amount);
	}

	/**
     * Gets the current state of this ATM.
     * @return the current state
	 */
	public int getState() {
		return state;
	}
}
