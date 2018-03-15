

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Reg extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
                        + "','" + request.getParameter("mobile")
                        + "','" + request.getParameter("img")
                        + "')";
                Statement st = con.createStatement();
                st.execute(sql);
                
               
                out.println("<h1> User Register Successfully </h1>");
            } catch (ClassNotFoundException | SQLException ex) {
                out.println("error:" + ex);
            }
                    }
    }

}
