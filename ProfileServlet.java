import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        PrintWriter out = res.getWriter();

        HttpSession session = req.getSession(false);
        String user = (String) session.getAttribute("username");

        out.println("Welcome Back " + user);
    }
}