
public class SavingsAccount {


  private double bankBalance;
    SavingsAccount(double bankBalance)
    {
    	super();this.bankBalance = bankBalance; 
    	}
    void withdraw(double amountToWithdraw)    {
        System.out.println("Withdrawing..."+amountToWithdraw);
        bankBalance = bankBalance - amountToWithdraw;
        System.out.println("Balance : "+bankBalance);
        //bankBalance = bankBalance - 20; // some coding fraud
    }
    public double getBankBalance() {   
    	return bankBalance;  
    	}
    @Override public String toString() {
        return "SavingsAccount [bankBalance=" + bankBalance + "]";
    }
    
    
}