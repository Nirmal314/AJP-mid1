import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1050);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        while (true) {
            String message = dis.readUTF();
            System.out.println("Client: " + message);

            String response = "Hello, client!";
            dos.writeUTF(response);

            if (message.equals("bye")) {
                break;
            }
        }
        ss.close();
    }
}
