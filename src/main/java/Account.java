public class Account {

    private AccountHolder holder;
    private double balance = 0.0;

    public Account(double amt, AccountHolder holder) {
        this.holder = holder;
        this.balance = amt;
    }

    public void deposit(double amt) {
        System.out.println(+amt + " deposited");
    }

    public void withdraw(double amt) {
        System.out.println(+amt + " withdrawn");
    }

    public double getBalance() {
        return balance;
    }

    public AccountHolder getHolder() {
        return holder;
    }

    public void setBalance(double amt) {
        this.balance = amt;
    }

    public void setHolder(AccountHolder holder) {
        this.holder = holder;
    }
}