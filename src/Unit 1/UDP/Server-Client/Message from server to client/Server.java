import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        String message = "Hello, UDP!";
        byte[] data = message.getBytes();

        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 1050);
        System.out.println("Data sent!");
        ds.send(dp);
        ds.close();
    }
}
