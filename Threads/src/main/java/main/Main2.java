package main;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2");
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Progrma Finalizado - %s - %s");
    }
}
