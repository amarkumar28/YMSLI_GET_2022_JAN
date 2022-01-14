package q3;

public class Main{
	public static void main(String[] args) {
		Account account=new CurrentAccount(12345 , "Amar", 57863.80);
		System.out.println(account.withdraw(500));
		System.out.println("Account Details ....");
		System.out.println("Username : " + account.getMemberName());
		System.out.println("Account Number : " + account.getAccountNumber());
		System.out.println("Account Balance : " + account.getAccountBalance());	
		
	}
}