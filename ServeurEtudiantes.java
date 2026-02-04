package server;

import java.io.*;
import java.net.*;

public class ServeurEtudiantes {

    public static final int PORT = 5000;

    public static void main(String[] args) {
        System.out.println("Serveur demarre sur le port " + PORT);

        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                Socket client = server.accept();
                System.out.println("Cliente connectee");
                client.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
