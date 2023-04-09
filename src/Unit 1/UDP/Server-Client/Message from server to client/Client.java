import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1050); // server_dp_port = client_ds_port

        byte[] data = new byte[1024];

        DatagramPacket dp = new DatagramPacket(data, data.length);

        ds.receive(dp);

        String message = new String(dp.getData());
        System.out.println(message);

        ds.close();
    }
}
