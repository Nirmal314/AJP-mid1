import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1050);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        while (true) {
            String message = "Hello, server!";
            dos.writeUTF(message);
            System.out.println("Sent message to server: " + message);

            String response = dis.readUTF();
            System.out.println("Received message from server: " + response);

            if (message.equals("bye")) {
                break;
            }
        }
        s.close();

    }
}
