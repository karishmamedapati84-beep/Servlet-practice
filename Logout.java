import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Logout extends HttpServlet {
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession(false);
        if(session != null) {
            session.invalidate();
        }
        out.println("<h2>You have logged out successfully</h2>");
        out.println("<a href='login.html'>Login Again</a>");
    }
}