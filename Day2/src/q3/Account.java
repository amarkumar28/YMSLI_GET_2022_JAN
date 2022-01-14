package q3;

import java.util.Random;

abstract class Account {
	private String memberName;
	private int accountNumber;
	private double accountBalance;
	public String getMemberName() {
		return memberName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	Account(){}
	public Account(String memberName, double accountBalance) {
		Random rand = new Random();
		this.accountNumber=10000 + rand.nextInt(89999);
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	abstract public double getBalance();
	abstract public double withdraw(double amount);
}

class SavingAccount extends Account{
	private int interest=5;
	private int maxWithdrawAmountLimit;
	public SavingAccount(int maxWithdrawAmountLimit, String username, double balance) {
		super(username,balance);
		this.maxWithdrawAmountLimit = maxWithdrawAmountLimit;
	}
	 
	public double getBalance() {
		return ((interest/100)*this.getAccountBalance() + this.getAccountBalance());
	}
	
	public double withdraw(double amount) {
		if(amount<maxWithdrawAmountLimit && (this.getAccountBalance()-amount) > 50000) {
			this.setAccountBalance(this.getAccountBalance()-amount);
		}
		return this.getAccountBalance();
	}
}

class CurrentAccount extends Account{
	private int tradeLicenseNumber;
	public CurrentAccount(int tradeLicenseNumber, String username, double balance) {
		super(username,balance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
	public double getBalance() {
		return this.getAccountBalance();
	}
	public double withdraw(double amount) {
		if(amount<this.getAccountBalance()) {
			this.setAccountBalance(this.getAccountBalance()-amount);
		}
		return this.getAccountBalance();
	}
}



