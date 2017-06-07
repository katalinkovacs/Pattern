package tutorialspoint.statictest;

/**
 * Created by kati on 5/06/2017.
 */
public class AccountTest {

    public static void main(String[] args){
        Account.balance = 10;

        Account a1 = new Account();
        a1.increment();
        System.out.println(Account.balance);


        Account a2 = new Account();
        a2.increment();
        System.out.println(Account.balance);
    }
}
