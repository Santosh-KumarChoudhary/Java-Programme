package Utils;

public class BankAccount {
	public static void main(String[] args) {
		
	
	BankWithDrawlandDeposit bank= new BankWithDrawlandDeposit(12345,"San Choudhary");
	
	
	bank.depositMoney(120);	
	System.out.println(bank.withdrawMoney(90));
	
	bank.depositMoney(-70);	
	bank.withdrawMoney(1000);

			

}
}