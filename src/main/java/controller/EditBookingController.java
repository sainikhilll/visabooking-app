package controller;

import DB.DBConnection;
import model.Booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/editBooking")
public class EditBookingController extends HttpServlet {
    Connection con = DBConnection.getCon();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Booking booking = new Booking();
        HttpSession session = request.getSession();
        String idOfUser  = (String) session.getAttribute("userId");

        booking.setFullName((String) request.getParameter("fullName"));
        booking.setPassportNumber((String) request.getParameter("passportNumber"));
        booking.setMotherName((String) request.getParameter("motherName"));
        booking.setFatherName((String) request.getParameter("fatherName"));
        booking.setDateOfBirth((String) request.getParameter("dateOfBirth"));
        booking.setTypeOfVisa((String) request.getParameter("typeOfVisa"));
        booking.setDateOfAppointment((String) request.getParameter("dateOfAppointment"));
        booking.setEntryDate((String) request.getParameter("entryDate"));
        booking.setStatus("Confirmed");
        booking.setVenue((String) request.getParameter("venue"));
        booking.setBookingId(Integer.parseInt(request.getParameter("bookingId")));
        try{
            Statement statement = con.createStatement();
            String query = "UPDATE Booking SET fullName='" + booking.getFullName() + "', passportNumber='" + booking.getPassportNumber() +
                    "', motherName='" + booking.getMotherName() + "', fatherName='" + booking.getFatherName() +
                    "', dateOfBirth='" + booking.getDateOfBirth() + "', typeOfVisa='" + booking.getTypeOfVisa() +
                    "', dateOfAppointment='" + booking.getDateOfAppointment() + "', entryDate='" + booking.getEntryDate() +
                    "', userID='" + idOfUser + "', status='" + booking.getStatus() + "', venue='" + booking.getVenue() +
                    "' WHERE bookingID=" + booking.getBookingId();
            statement.executeUpdate(query);
            response.sendRedirect("message.jsp?msg= Updated Booking Successfully");
        } catch (SQLException e) {
            response.sendRedirect("message.jsp?msg= Failed to update booking");
            System.out.println("Failed to update booking");
            e.printStackTrace();
        }
    }
}
