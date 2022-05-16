import java.io.*;
import java.net.*;
public class Client {
    public static void main(String args[]) throws Exception{
        Socket s= new Socket("192.168.8.137",7777);
        if(s.isConnected()){
            System.out.println("onnected to server");
        }
        FileOutputStream fout=new FileOutputStream("received.txt");
        DataInputStream din= new DataInputStream(s.getInputStream());
        int r;
        while((r=din.read())!=-1){
            fout.write((char)r);
        }
        s.close();
    }
    
}