package SocketProgramlama;

import java.io.*;
import java.net.Socket;

public class Client {

    private Socket socket=null;
    private DataInputStream inputStream=null;
    private DataOutputStream outputStream=null;

    public Client(String address,int port) throws IOException {
        socket = new Socket(address,port);
        System.out.println("Client sunucuya bağlandı!");
        inputStream = new DataInputStream(System.in);
        outputStream = new DataOutputStream(socket.getOutputStream());
        String metin="";
        while (!metin.equals("exit")){
            try {
                metin = inputStream.readLine();
                outputStream.writeUTF(metin);
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        inputStream.close();
        outputStream.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client("127.0.0.1",5000);
    }
}
