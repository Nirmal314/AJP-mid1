import java.io.*;
import javax.servlet.*;

public class genServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        System.out.println("Servlet Config" + getServletConfig());
        System.out.println("Servlet Context" + getServletContext());

        PrintWriter out = res.getWriter();

        out.print("<html><body>");
        out.print("<h3>This is genServlet</h3>");
        out.print("</body></html>");
    }

}
