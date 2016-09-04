
public class BankAccount {
	private double balance;
	
	public BankAccount(double balance)
	{
		this.balance = balance;
	}
	public BankAccount()
	{
		this(0);
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double abalance)
	{
		balance = abalance;
	}
	public void deposit(double amount)
	{
		balance += amount;
	}
	public void withdraw(double wdraw)
	{
		balance -= wdraw;
	}
	

}
