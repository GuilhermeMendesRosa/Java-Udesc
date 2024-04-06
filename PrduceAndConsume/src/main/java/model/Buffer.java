package model;

import java.util.ArrayDeque;
import java.util.Queue;

public class Buffer {
    private final Queue<Integer> queue = new ArrayDeque<Integer>();

    public void pushNumber(Integer number) {
        this.queue.add(number);
    }

    public Integer popNumber() {
        return this.queue.poll();
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

}
