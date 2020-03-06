package secondsynchr;

public class Account {
    private int balance;
    private Object lock = new Object();

    public void deposit(int amount){
        synchronized (lock) {
            int x = balance + amount;
            balance = x;
        }
    }

    public void withdraw(int amount){
        synchronized (lock) {
            int x = balance - amount;
            balance = x;
        }
    }
}
