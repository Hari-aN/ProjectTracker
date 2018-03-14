
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Reg extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
             try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/major", "root", "root");

                String sql = "insert into reg values('"
                        + request.getParameter("rollno")
                        + "','" + request.getParameter("fname")
                        + "','" + request.getParameter("lname")
                        + "','" + request.getParameter("sem")
                        + "','" + request.getParameter("branch")
                        + "','" + request.getParameter("project id")
                        + "','" + request.getParameter("email")
                        + "','" + request.getParameter("password")
                        + "'," + request.getParameter("mobile")
                        + ")";
                Statement stat = con.createStatement();
                boolean r=stat.execute(sql);
                out.println(r);
               
                out.println("<h1> User Register Successfully </h1>");
            } catch (ClassNotFoundException | SQLException ex) {
                out.println("error:" + ex);
            }
            
        }
    }

    
}
