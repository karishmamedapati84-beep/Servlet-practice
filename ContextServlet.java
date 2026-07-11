import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContextServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        ServletContext context = getServletContext();

        Integer count = (Integer) context.getAttribute("visitorCount");

        if(count == null) {
            count = 0;
        }

        count++;
        context.setAttribute("visitorCount", count);

        PrintWriter out = res.getWriter();
        out.println("Total Visitors: " + count);
    }
}