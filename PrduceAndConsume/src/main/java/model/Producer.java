package model;

import java.util.Random;

public class Producer {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void produce() {
        for (int i = 0; i < 100; i++) {
            this.buffer.pushNumber(new Random().nextInt());
        }
    }

}
