import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NavigationTracking1 extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        PrintWriter out = res.getWriter();

        out.println("<a href='home?nav=Home'>Go Page1</a>");
        out.println("<a href='page2?nav=home,page1,home,page2'>Go Page2</a>");
    }
}