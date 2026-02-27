import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VisitCount extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        int count = 1;
        Cookie[] cookies = req.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("visit")) {
                    count = Integer.parseInt(c.getValue());
                    count++; 
                }
            }
        }
        Cookie visitCookie =
            new Cookie("visit", String.valueOf(count));
            res.addCookie(visitCookie);
        out.println("Visits : " + count);
    }
}