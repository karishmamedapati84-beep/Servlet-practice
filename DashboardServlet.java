import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");

        out.println("<h2>Welcome " + name + "</h2>");
    }
}