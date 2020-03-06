package synchr;

public class Account {
    private int balance;

    public Account(int balance){

        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public synchronized void deposit(int amount){
        int x = balance + amount;
        balance = x;
    }

    public synchronized void withdraw(int amount){
        int x = balance - amount;
        balance = x;
    }
}
