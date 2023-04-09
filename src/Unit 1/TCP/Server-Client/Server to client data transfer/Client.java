import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1050);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        String data = dis.readUTF();

        System.out.println(data);
        s.close();
    }
}
