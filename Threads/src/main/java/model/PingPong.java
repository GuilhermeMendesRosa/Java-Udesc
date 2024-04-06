package model;

public class PingPong extends Thread {
    private String palavra;

    public PingPong(String palavra) {
        this.palavra = palavra;
    }

    public void run() { //implementa o método run
        for (int i = 0; i < 1000; i++) {
            System.out.println(palavra);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
