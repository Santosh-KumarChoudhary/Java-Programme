package Utils;

public class BankWithDrawlandDeposit {
	
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	
	
	
	public BankWithDrawlandDeposit (long accountNumber,String accountHolderName)
	{
	
	this.accountNumber= accountNumber;
	this.accountHolderName=accountHolderName;
	
	}
	
	
	public void depositMoney(double depositmoney)
	
	{
		
		if (depositmoney<=0)
			
		{
			System.out.println("Invalid amount");
		}
		else
		{
		balance+=depositmoney;
		System.out.println("Balance is :"+balance);
		
		};
	}
	
	public double withdrawMoney(double moneuwithdrawn)
	
	{
		
	if(balance> moneuwithdrawn)
		
	{
		balance= balance-moneuwithdrawn;
		
		System.out.println("Your balance is :"+balance);
	}
	else if (moneuwithdrawn<=0)
		
	{
		System.out.println("Invalid widthdraw");
	}
	
	else 
		
	{
		moneuwithdrawn=balance;
		balance=0;
		
		System.out.println("AFter withdrawn  : "+balance);
	}
	
	return balance;
	}
	

}
