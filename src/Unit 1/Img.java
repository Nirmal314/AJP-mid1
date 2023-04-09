import java.net.*;
import java.awt.*;

public class Img {
    public static void main(String[] args) throws Exception {
        URL u = new URL(
                "https://plus.unsplash.com/premium_photo-1667667846223-0213b13d89c3?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80");
        Image img = (Image) u.getContent();
        System.out.println(img);
    }
}
