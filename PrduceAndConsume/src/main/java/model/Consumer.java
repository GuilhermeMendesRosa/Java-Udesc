package model;

public class Consumer {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void consume() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }

            if (this.buffer.isEmpty()) {
                continue;
            }

            Integer number = this.buffer.popNumber();
            Integer product = number * 10;
            System.out.printf("O valor do buffer x 10 = %d\n", product);
        }
    }

}
