package thread;

public class ThreadDemo {
    public static void main(String[] args) {
        Talk talk  = new Talk();
        Thread walk = new Thread(new Walk());
        talk.start();
        walk.start();

        //first.Walk w = new first.Walk(); // просто объект, не поток
        // w.run(); //выполнится метод, но поток не запустится!
    }
}
