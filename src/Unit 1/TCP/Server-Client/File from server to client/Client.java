import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1050);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        Scanner sc = new Scanner(System.in);
        System.out.print("Which file?: ");
        String fileChoosen = sc.nextLine();

        dos.writeUTF(fileChoosen);

        String data = dis.readUTF();

        System.out.println(data);

        s.close();
        sc.close();
    }
}
