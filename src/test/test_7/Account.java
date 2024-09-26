package test.test_7;

public class Account {
    private String num;
    private int balance;

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }
    public boolean transfer(Account other, int amount) {
        if(balance < amount)
            return false;

            this.balance -= amount;
            other.balance += amount;

        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "num='" + num + '\'' +
                ", balance=" + balance +
                '}';
    }
}
