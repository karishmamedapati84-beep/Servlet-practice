import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
 
public class PortfolioServlet extends HttpServlet { 
 
    protected void doGet(HttpServletRequest req, 
                         HttpServletResponse res) 
                         throws IOException { 
 
        res.setContentType("text/html"); 
        PrintWriter out = res.getWriter(); 
 
        out.println("<h1>Welcome to my portfolio</h1>");
        out.println("<h2>About Me</h2>");
        out.println("<p>I am Karishma.Currently pursuing B.tech under the domain of CSE in GIET University.</p>");
        out.println("<p>I am intrested in learning programming and improving my technical skills.</p>");
        out.println("<h2>Education</h2>");
        out.println("<table border=1>");
        out.println("<tr>");
        out.println("<th>SL.NO</th>");
        out.println("<th>DEGREES</th>");
        out.println(" <th>BOARD/UNIVERSITY</th>");
        out.println("<th>YEAR</th>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>1</td>");
        out.println("<td>Bachelor's Degree</td>");
        out.println("<td>Gandhi Institue of Engineering and Technology University</td>");
        out.println("<td>2024-2028</td>");
        out.println(" </tr>");
        out.println("<tr>");
        out.println("<td>2</td>");
        out.println("<td>Intermediate</td>");
        out.println("<td>Gandhi Public School</td>");
        out.println("<td>2022-2024</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>3</td>");
        out.println("<td>Matriculation</td>");
        out.println("<td>ZPB High School</td>");
        out.println("<td>2021-2022</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println(" <h2>Technical Skills</h2>");
        out.println("<ul>");
        out.println("<li>Java</li>");
        out.println("<li>HTML</li>");
        out.println("<li>C</li>");
        out.println("</ul>");
        out.println("<h2>My Projects</h2>");
        out.println("<h3>Project1:VISA CONSULTANCY</h3>");
        out.println("<p>Visa Consultancy Management System is a third-semester academic project developed to manage \r\n" + //
                        "        and simplify the visa application process for students and professionals. The system allows\r\n" + //
                        "         consultants to handle client details, document verification, application submission, and \r\n" + //
                        "         status tracking through a centralized platform. It reduces manual work and improves \r\n" + //
                        "         efficiency by providing organized data management and real-time application updates. \r\n" + //
                        "         The project was developed using HTML, CSS, JavaScript, a backend technology, and MySQL \r\n" + //
                        "         for database management, and it helped me gain practical experience in web development, \r\n" + //
                        "         database design, and real-world workflow implementation.</p>");
        out.println("<h3>Project2:HEALTH CONNECT</h3>");
        out.println("<p>Health Connect is a fourth-semester ongoing project aimed at creating a digital\r\n" + //
                        "       platform that connects patients with healthcare services for easy access to medical support.\r\n" + //
                        "       The system focuses on features such as patient registration, appointment booking, health \r\n" + //
                        "       record management, and communication between patients and healthcare providers. \r\n" + //
                        "       The project is being developed to improve accessibility, reduce waiting time, and \r\n" + //
                        "       streamline healthcare interactions using modern web technologies and a structured database. \r\n" + //
                        "       Through this project, I am gaining hands-on experience in full-stack development, system \r\n" + //
                        "       design, and building scalable applications for real-world healthcare needs.</p>");
        out.println("<section>");
        out.println("<form action=\"\">");
        out.println("<fieldset>");
        out.println(" <legend>Contact Form</legend>");
        out.println("<label for=\"\">Name:</label>");
        out.println("<br>");
        out.println("<input type=\"text\">");
        out.println("<br>");
        out.println("<label for=\"\">Email:</label>");
        out.println("<br>");
        out.println("<input type=\"Email\" placeholder=\"karishmamedapati84@gmail.com\" required>");
        out.println("<br>");
        out.println("<label for=\"\">Message:</label>");
        out.println("<br>");
        out.println("<textarea id=\"textarea\" rows=\"5\" cols=\"50\" placeholder=\"Message\" required></textarea>");
        out.println("</fieldset>");
        out.println("</form>");
        out.println("</section>");
    } 
} 
 