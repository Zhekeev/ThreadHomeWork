package secondsynchr;

class StaticSynch extends Thread{

    public static synchronized void a(){
        System.out.println("Line #1 in the method a");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Line #2 in the method a");
    }

    public static synchronized void b(){
        System.out.println("Line #1 in the method b");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Line #2 in the method b");
    }
}

