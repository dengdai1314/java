package SocketPractice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {
    private final ServerSocket mserverSocket;

    public EchoServer(int port) throws Exception{
        mserverSocket = new ServerSocket(port);
    }
    public void run() throws IOException{
        Socket client = mserverSocket.accept();
        handleClient(client);
    }
    private void handleClient(Socket socket) throws IOException{
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        byte[] buffer = new byte[1024];
        int n;
        while ((n = in.read(buffer))> 0 ){
            out.write(buffer,0,n);
        }
    }

    public static void main(String[] args) {
        try {
            EchoServer server = new EchoServer(9877);
            server.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
