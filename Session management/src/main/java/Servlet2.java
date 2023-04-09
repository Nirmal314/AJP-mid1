import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet2 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        Cookie ck[] = req.getCookies();
        pw.print("Hello (from Cookie), " + ck[0].getValue());
    }
}
