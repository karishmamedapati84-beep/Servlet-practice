import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
                          throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(username.equals("admin") && password.equals("1234")) {
            out.println("<h2>Login Successful</h2>");
            out.println("<h3>Welcome " + username + "</h3>");
        }
        else {
            out.println("<h2>Login Failed</h2>");
            out.println("<h3>Invalid Username or Password</h3>");
        }
    }
}