package JspServlet;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
public class welcome_jsp implements Servlet {
public void init(ServletConfig config) throws ServletException {}
public void service(ServletRequest request, ServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("");
out.println("     <html>");
out.println("       <head>");
out.println("         <title>欢迎</title>");
out.println("       </head>");
out.println("        <body>");
out.println("               欢迎学习Java JSP现在的时间是:");
out.println("               ");
out.println("");

               out.println(new java.util.Date());
               
out.println("");
out.println("          ");
out.println("        </body>");
out.println("    </html>");
out.println("");}
public void destroy() {}
public String getServletInfo() {
return null;
}
public ServletConfig getServletConfig() {
return null;}}