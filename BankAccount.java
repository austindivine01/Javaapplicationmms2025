public class BankAccount{
	
	 String accountName;
	 String accountNumber;
	 String accountType;
	 double balance;
	 
	 public BankAccount(String accountName, String accountNumber, String accountType, double balance){
		this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
	}
	
	public void transferFunds(){
		
	}
	public void displayAccountInfo(){
		System.out.printf("Account Name: %s%n",accountName);
		System.out.printf("Account Number: %s%n",accountNumber);
		System.out.printf("Account Type: %s%n",accountType);
		System.out.printf("Account Balance: $%.2f",balance);
	}
	
}