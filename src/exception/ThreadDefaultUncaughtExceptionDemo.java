package exception;

public class ThreadDefaultUncaughtExceptionDemo {
    public static void main(String[] args) {

        Thread.setDefaultUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t+" (default handler)throws exception: "+e);
                    }
                });

        Thread t1 = new Thread(new MyThread());
        t1.start();
        }
}

class MyThread implements Runnable {
    public void run() {
        throw new RuntimeException();
    }
}
