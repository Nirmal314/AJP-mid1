import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String name = req.getParameter("name");
        pw.print("Added " + name + " to Cookies");

        Cookie ck = new Cookie("username", name);

        res.addCookie(ck);

    }
}
