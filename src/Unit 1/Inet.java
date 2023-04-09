import java.net.*;

public class Inet {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getByName("google.com");

        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
    }
}
