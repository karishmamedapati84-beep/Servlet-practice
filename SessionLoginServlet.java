import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
                          throws IOException {

        PrintWriter out = res.getWriter();

        String name = req.getParameter("user");

        HttpSession session = req.getSession();
        session.setAttribute("username", name);

        out.println("Login Successful<br>");
        out.println("<a href='profile'>Go to Profile</a>");
    }
}
