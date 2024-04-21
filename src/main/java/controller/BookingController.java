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

@WebServlet("/book")
public class BookingController extends HttpServlet {
    Connection con = DBConnection.getCon();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userId");
        Booking booking =new Booking();

        booking.setUserId(Integer.parseInt(userID));
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


        try{
            Statement statement = con.createStatement();
            statement.executeUpdate("INSERT INTO Booking(fullName, passportNumber, motherName, fatherName, dateOfBirth, typeOfVisa, dateOfAppointment, entryDate, userID, status, venue) VALUES ('"+booking.getFullName()+"', '"+booking.getPassportNumber()+"', '"+booking.getMotherName()+"', '"+booking.getFatherName()+"', '"+booking.getDateOfBirth()+"', '"+booking.getTypeOfVisa()+"', '"+booking.getDateOfAppointment()+"', '"+booking.getEntryDate()+"', '"+userID+"','"+booking.getStatus()+"','"+booking.getVenue()+"')");
            response.sendRedirect("message.jsp?msg= Visa Slot Booked Successfully!");
        }catch(SQLException e){
            response.sendRedirect("message.jsp?msg= Failed to Book Slot");
            System.out.println("Failed to Book Slot");
            e.printStackTrace();
        }
    }
}
