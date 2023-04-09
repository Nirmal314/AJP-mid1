import java.net.*;

public class Url {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.github.com");
        System.out.println(u.getProtocol());
        System.out.println(u.getHost());
        System.out.println(u.getPort());
        System.out.println(u.getPath());
        System.out.println(u.getQuery());
    }
}
