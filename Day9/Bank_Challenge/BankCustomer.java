package Day9.Bank_Challenge;
import java.util.*;
public class BankCustomer {
    
    private  int lastCustomerId=1000000;

    private final String name;
    private final int customerId;
    private final List<BankAccount> accounts=new ArrayList<>();

     BankCustomer(String name,double checkingAmount,double savingAmount){
        this.name=name;
        this.customerId=lastCustomerId++;
        accounts.add(new BankAccount(BankAccount.AccountType.CHECKING,checkingAmount));
        accounts.add(new BankAccount(BankAccount.AccountType.SAVINGS, savingAmount));

    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        String[] accountString=new String[accounts.size()];
        Arrays.setAll(accountString, i -> accounts.get(i).toString());
        return "Customer: %s (id:%015d)%n\t%s%n".formatted(name, customerId,
                String.join("\n\t", accountString));
    }
   
    
    
}
