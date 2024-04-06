import model.Buffer;
import model.Consumer;
import model.Producer;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        new Thread(() -> {
            producer.produce();
        }).start();
        new Thread(() -> {
            consumer.consume();
        }).start();
    }
}
