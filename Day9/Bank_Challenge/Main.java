package Day9.Bank_Challenge;
import java.util.*;
public class Main {

    public class MyAccount extends BankAccount{
          MyAccount(AccountType accountType, double balance){
            super(accountType, balance);
          }
    }
    public static void main(String[] args) {
      BankCustomer raja=new BankCustomer("Raja", 500, 10000);
      System.out.println(raja);

      List<BankAccount> list=raja.getAccounts();
      list.clear();
      System.out.println(raja);

    //   list.add(new BankAccount(BankAccount.AccountType.CHECKING, 15000));
    //   System.out.println(raja);
    }
    

}
