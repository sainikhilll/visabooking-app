package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DB.DBConnection;
import model.User;

@WebServlet("/user")
public class UserController extends HttpServlet{
    Connection connection = DBConnection.getCon();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        User user = new User();
        user.setFirstname(request.getParameter("firstName"));
        user.setLastname(request.getParameter("lastName"));
        user.setEmail(request.getParameter("email"));
        user.setPhone(request.getParameter("phone"));
        user.setAddress(request.getParameter("address"));
        user.setCountryOfResidence(request.getParameter("countryOfResidence"));
        user.setPassword(request.getParameter("password"));

        try {
            Statement statment = connection.createStatement();
            ResultSet rs = statment.executeQuery("select * from User where email='"+user.getEmail()+"' or phone='"+user.getPhone()+"'");
            if(rs.next()) {
                response.sendRedirect("message.jsp?msg=Account already registered with given email/phone");;
            }else {
                Statement st1 = connection.createStatement();
                st1.executeUpdate("insert into User(firstName, lastName, countryOfResidence, email, phone, address, password) values('"+user.getFirstname()+"', '"+user.getLastname()+"', '"+user.getCountryOfResidence()+"', '"+user.getEmail()+"', '"+user.getPhone()+"', '"+user.getAddress()+"', '"+user.getPassword()+"')");
                response.sendRedirect("index.jsp");
            }
        } catch (SQLException e) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Registration failed');");
            out.println("</script>");
            response.sendRedirect("message.jsp?msg= Registration failed");
            System.out.println("Registartion failed");
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Statement statment = connection.createStatement();
            ResultSet rs = statment.executeQuery("select * from User where email='"+email+"' and password='"+password+"'");
            if(rs.next()) {
                System.out.println("here");
                HttpSession session = request.getSession();
                session.setAttribute("userId", rs.getString("id"));
                session.setAttribute("role", "User");
                response.sendRedirect("book.jsp");
            }else{
                response.sendRedirect("message.jsp?msg=Invalid Credentials! Please try again with valid credentials");
            }
        } catch (SQLException e) {
            System.out.println("failed Member Servlet:");
            e.printStackTrace();
        }
    }

}
