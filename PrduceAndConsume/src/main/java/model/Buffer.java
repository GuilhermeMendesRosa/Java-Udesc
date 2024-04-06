package model;

import java.util.ArrayDeque;
import java.util.Queue;

public class Buffer {
    private Queue<Integer> items = new ArrayDeque<Integer>();

    public void pushNumber(Integer number) {
        this.items.add(number);
    }

    public Integer popNumber() {
        return this.items.poll();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

}
