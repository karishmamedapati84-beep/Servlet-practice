import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class URLRewriteServlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        PrintWriter out = res.getWriter();

        out.println("<a href='second?name=Remo'>Go Next</a>");
    }
}