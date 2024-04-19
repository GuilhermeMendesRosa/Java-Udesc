package br.udesc.gmr;

import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void main(String args[]) throws IOException {
        var servidor = new Socket("127.0.0.1", 8080);
        System.out.println("Cliente conectado!");
    }
}