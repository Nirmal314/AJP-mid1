import java.net.*;
import java.util.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1050);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        String inputFile = dis.readUTF();

        File file = new File(inputFile);

        Scanner sc = new Scanner(file);
        StringBuffer sb = new StringBuffer();

        while (sc.hasNext()) {
            sb.append(sc.nextLine() + "\n");
        }

        dos.writeUTF(sb.toString());

        System.out.println("File sent!");
        sc.close();

        ss.close();
    }
}
