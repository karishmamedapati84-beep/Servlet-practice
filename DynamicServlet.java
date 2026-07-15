import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 

public class DynamicServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req,
                        HttpServletResponse res)
                        throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<form method=post>");
        out.println("<h2>ENTER YOUR NAME:</h2>");
        out.println("<input type=\"text\" name=\"Name\" id=\"Name\" placeholder=\"Enter your Name\">");
        out.println("<h2>SELECT YOUR SKILLS:</h2>");
        out.println("<input type=\"checkbox\" id=\"val1\" name=\"skills\" value=\"JAVA\">");
        out.println("<label for=\"val1\">JAVA</label><br>");
        out.println("<input type=\"checkbox\" id=\"val2\" name=\"skills\" value=\"HTML\">");
        out.println("<label for=\"val2\">HTML</label><br>");
        out.println("<input type=\"checkbox\" id=\"val3\" name=\"skills\" value=\"CSS\">");
        out.println("<label for=\"val3\">CSS</label><br>");
        out.println("<input type=\"checkbox\" id=\"val4\" name=\"skills\" value=\"PYTHON\">");
        out.println("<label for=\"val4\">PYTHON</label><br>");
        out.println("<input type=\"checkbox\" id=\"val5\" name=\"skills\" value=\"IOT\">");
        out.println("<label for=\"val5\">IOT</label><br>");
        out.println("<input type=\"checkbox\" id=\"val6\" name=\"skills\" value=\"DATA SCIENCE\">");
        out.println("<label for=\"val6\">DATA SCIENCE</label><br>");
        out.println("<input type=\"checkbox\" id=\"val7\" name=\"skills\" value=\"MACHINE LEARNING\">");
        out.println("<label for=\"val7\">MACHINE LEARNING</label><br>");
        out.println("<input type=\"checkbox\" id=\"val8\" name=\"skills\" value=\"REACT\">");
        out.println("<label for=\"val8\">REACT</label><br>");
        out.println("<input type=\"submit\" value =\"Submit\">" );
        out.println("</form>");
    }
protected void doPost(HttpServletRequest req,
                        HttpServletResponse res)
                        throws IOException {
        res.setContentType("text/html");
        String name = req.getParameter("Name");
        String[] skills = req.getParameterValues("skills");
        PrintWriter out = res.getWriter();
        out.println("<h2>NAME: " + name + "</h2>");

        for(int i =0; i<skills.length; i++)
        {
            out.println("<h1>Skill " + (i+1) + " " + skills[i] + "</h1>");
        }
        
    }
}