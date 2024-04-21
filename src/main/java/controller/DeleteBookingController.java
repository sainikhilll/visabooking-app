package controller;

import DB.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


@WebServlet("/delete")
public class DeleteBookingController extends HttpServlet {
    Connection con = DBConnection.getCon();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookingId = req.getParameter("bookingId");

        try {
            Statement statement = con.createStatement();
            String sql = "DELETE FROM booking WHERE bookingId="+bookingId;
            statement.executeUpdate(sql);
            resp.sendRedirect("message.jsp?msg= Deleted Appointment");
        } catch (SQLException e) {
            resp.sendRedirect("message.jsp?msg= Failed to Delete Appointment");
            System.out.println("Failed to Delete Appointment");
            e.printStackTrace();
        }
    }
}
