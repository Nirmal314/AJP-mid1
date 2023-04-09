import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class httpServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        System.out.println("Servlet Config" + getServletConfig());
        System.out.println("Servlet Context" + getServletContext());
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<h3>This is httpServlet</h3>");
        out.print("</body></html>");
    }
}
