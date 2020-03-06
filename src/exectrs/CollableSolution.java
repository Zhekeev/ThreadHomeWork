package exectrs;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CollableSolution {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Integer> s = ex.submit(new CallableThread());
        Future<Integer> s1 = ex.submit(new CallableThread());
        try {
            System.out.println("а я уже здесь");
            System.out.println(s.isDone());
            System.out.println(s.get());
            System.out.println(s1.get());
            System.out.println(s.isDone());
        } catch (ExecutionException | InterruptedException e) {
            System.out.println("Exception " + e);
        }
    }
}