import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet1 extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
                          throws IOException {

        String user = req.getParameter("user");

        if(user != null && !user.isEmpty()) {
            res.sendRedirect("dashboard?name=" + user);
        } else {
            res.sendRedirect("login1.html");
        }
    }
}