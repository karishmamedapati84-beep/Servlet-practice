import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        PrintWriter out = res.getWriter();

        ServletConfig config = getServletConfig();
        String email = config.getInitParameter("adminEmail");

        out.println("Admin Email: " + email);
    }
}