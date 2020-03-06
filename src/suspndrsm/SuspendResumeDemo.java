package suspndrsm;

public class SuspendResumeDemo {

    public static void main(String[] args) {
        ConsoleClock clock = new ConsoleClock();
        clock.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clock.suspend();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clock.resume();
    }
}
