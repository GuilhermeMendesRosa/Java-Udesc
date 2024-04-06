package main;

import java.util.Random;

public class ExplodePC {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            new Thread(() -> {
                while (true) {
                    double z = new Random().nextDouble() * new Random().nextDouble();
                    z *= z;
                }
            }).start();
        }
    }
}
