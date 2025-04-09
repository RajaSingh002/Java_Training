package Day24;
import java.io.*;

import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BankAccountTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("It will run before any method");
    }
   @org.junit.Test
    public void deposit() throws Exception {
      
       
    }

    @org.junit.Test
    public void withdraw() throws Exception {
        BankAccount account=new BankAccount("Raja", "Singh", 10000);
        double balance=account.withdraw(5000, true);
        assertEquals(5000,balance,0);
    }

    @org.junit.Test
    public void getBalance() throws Exception {
        BankAccount account=new BankAccount("Raja", "Singh", 10000);
        account.deposit(20000, true);
        assertEquals(30000,account.getBalance(),0);
    }
   
}
