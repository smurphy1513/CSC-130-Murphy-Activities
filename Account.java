public class Account {

	private double dollarsInAccount;
	private int secretPin = 1234;
	
	public void setBalance(double balance) {
		 dollarsInAccount = balance;
	}
	public double getBalance() {
		return dollarsInAccount;
	}
	public void makeDeposit(double deposit) {
		dollarsInAccount = dollarsInAccount + deposit;
	}
	public void makeWithdrawal(double withdrawal) {
		if (withdrawal < dollarsInAccount) {
			dollarsInAccount = dollarsInAccount - withdrawal;
		}
		if (withdrawal == dollarsInAccount) {
			dollarsInAccount = dollarsInAccount - withdrawal;
		}
	}
	public String describeBalance() {
		String description = null;
		if (dollarsInAccount > 10000) {
			description = "That's a comfortable balance.";
		}
		if (dollarsInAccount < 10000 && dollarsInAccount > 1000) {
			description = "That's enough for rent and groceries.";
		}
		if (dollarsInAccount < 1000 && dollarsInAccount > 100) {
			description = "Getting a bit low.";
		}
		if (dollarsInAccount < 100) {
			description = "Time for a deposit!";
		}
		return description;
	}
	public String checkPin(int pinNum) {
		String string;
		if (pinNum == secretPin) {
			string = "Correct PIN recognized";
		}
		else {
			string = "Incorrect PIN";
		}
		return string;
	}
	public void accumulateInterest(double interestRate) {
		dollarsInAccount = dollarsInAccount + (dollarsInAccount * interestRate);
	}
}
