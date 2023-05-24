package SocketProgramlama;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private Socket socket = null;
    private ServerSocket serverSocket = null;
    private DataInputStream dataInputStream = null;

    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Sunucu başlatıldı\nBir client(istemci) bekleniyor..");
        socket = serverSocket.accept();
        System.out.println("Bir client(istemci) kabul edildi!");
        dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        String metin="";
        while (!metin.equals("exit")){
            metin = dataInputStream.readUTF();
            System.out.println(metin);
        }
        System.out.println("Bağlantı sonlandırılıyor...");
        dataInputStream.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(5000);
    }
}
