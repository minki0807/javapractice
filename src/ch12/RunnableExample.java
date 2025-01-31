package src.ch12;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("run!");
        runnable.run();
    }
}
