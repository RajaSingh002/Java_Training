package Day9.Bank_Challenge;

public class BankAccount {
    
    public enum AccountType{
        CHECKING ,SAVINGS;
    }

    private final AccountType accountType;
    private final double balance;
   
    BankAccount(AccountType accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }
    public AccountType getAccountType() {
        return accountType;
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public String toString() {
        return "BankAccount [accountType=" + accountType + ", balance=" + balance + "]";
    }

    
    
    
}
