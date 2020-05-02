package SocketPractice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
    private final Socket mSocket;

    public EchoClient(String host,int port) throws IOException{
        mSocket = new Socket(host, port);
    }

    /**
     * 读取服务器的响应
     * @throws Exception
     */
    public void run() throws Exception{
//        Thread readerThread = new Thread(this::readResponse);
        Thread readerThread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        readerThread.start();

        OutputStream out = mSocket.getOutputStream();
        byte[] buffer = new byte[1024];
        int n;
        while ((n = System.in.read(buffer)) > 0){
            out.write(buffer,0,n);
        }
    }

    /**
     * 读取用户输入
     */
    private void readResponse(){
        try {
            InputStream in = mSocket.getInputStream();
            byte[] buffer = new byte[1024];
            int n;
            while ((n = in.read(buffer)) > 0){
                System.out.write(buffer,0,n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            EchoClient client = new EchoClient("127.0.0.1",9877);
            client.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
