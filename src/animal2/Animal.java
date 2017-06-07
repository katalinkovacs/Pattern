package animal2;

/**
 * Created by kati on 5/06/2017.
 */
public class Animal {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int startingBalance) {

        if (startingBalance < 0){
            System.out.println("balance cannot be less than 0");
        }
        this.balance = startingBalance;
    }
}
