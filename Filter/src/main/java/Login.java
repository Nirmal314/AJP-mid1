import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login implements Filter {
    FilterConfig fc;

    @Override
    public void init(FilterConfig fc) {
        this.fc = fc;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        String password = req.getParameter("password");

        if (password.equals("filterdemo")) {

            // Sending request to next
            // chain.doFilter(req, res);
            HttpServletResponse resp = (HttpServletResponse) res;
            resp.sendRedirect("/u32/welcome");
        } else {
            pw.print("username or password is wrong");
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            rd.forward(req, res);
        }
    }

    @Override
    public void destroy() {

    }
}
