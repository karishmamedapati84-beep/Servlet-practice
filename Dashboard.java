import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Dashboard extends HttpServlet {
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession(false);
        if(session != null) {
            String user = (String) session.getAttribute("user");
            out.println("<h2>Welcome to Dashboard</h2>");
            out.println("<h3>Hello " + user + "</h3>");
            out.println("<br><a href='Logout'>Logout</a>");
        }
        else {
            out.println("<h2>Please login first</h2>");
            out.println("<a href='login.html'>Login</a>");
        }
    }
}