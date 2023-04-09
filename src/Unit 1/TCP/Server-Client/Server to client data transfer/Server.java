import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1050);
        Socket s = ss.accept();

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Message from server!");

        System.out.println("Message sent to client.");

        ss.close();
        s.close();
    }
}
