package main;

import model.PingPong;

public class Main {

    public static void main(String[] args) {
        new PingPong("ping").start();
        new PingPong("pong").start();
    }

}
