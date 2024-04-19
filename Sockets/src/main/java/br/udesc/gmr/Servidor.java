package br.udesc.gmr;

import java.io.IOException;
import java.net.ServerSocket;

public class Servidor {
    public static void main(String args[]) throws IOException {
        var servidor = new ServerSocket(8080);
        System.out.println("Servidor iniciado na 8080!");
        var socket = servidor.accept();
        System.out.println("Conexão estabelecida!");
    }
}
