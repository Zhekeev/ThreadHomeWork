package secondsynchr;

public class OperatorDeposit extends Thread {
    private Account account;
    public OperatorDeposit(Account account){this.account = account;}

    public void run(){
        for(int i=0; i<5; i++){
            synchronized (account) {
                account.deposit(100);
            }
        }
    }
}
