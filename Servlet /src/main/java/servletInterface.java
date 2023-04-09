import java.io.*;
import javax.servlet.*;

public class servletInterface implements Servlet {
    ServletConfig config;

    @Override
    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("Initialized");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<h3>This is servletInterface</h3>");
        out.print("</body></html>");

    }

    @Override
    public void destroy() {
        System.out.println("Destroyed");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public String getServletInfo() {
        return "Created by nemo";
    }

}
