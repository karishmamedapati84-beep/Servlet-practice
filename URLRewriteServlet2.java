import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class URLRewriteServlet2 extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");

        out.println("Welcome " + name);
    }
}