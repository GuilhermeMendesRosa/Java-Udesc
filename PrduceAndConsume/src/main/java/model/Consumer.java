package model;

public class Consumer {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void consume() {
        while (true) {
            if (this.buffer.isEmpty()) {
                continue;
            }

            Integer i = this.buffer.popNumber();
            Integer product = i * 10;
            System.out.printf("O valor do buffer x 10 = %d\n", product);
        }
    }

}
