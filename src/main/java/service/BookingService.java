package service;

import DB.DBConnection;
import model.Booking;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookingService {

    Connection con = DBConnection.getCon();
    public List<Booking> getBookingsByUserId(String idOfUser){
        try{
            List<Booking> bookings = new ArrayList<>();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from Booking where userID="+idOfUser+";");

            while (resultSet.next()){
                Booking booking = new Booking();
                booking.setUserID(Integer.parseInt(idOfUser));
                booking.setFullName(resultSet.getString("fullName"));
                booking.setPassportNumber(resultSet.getString("passportNumber"));
                booking.setMotherName(resultSet.getString("motherName"));
                booking.setFatherName(resultSet.getString("fatherName"));
                booking.setDateOfBirth(resultSet.getString("dateOfBirth"));
                booking.setTypeOfVisa(resultSet.getString("typeOfVisa"));
                booking.setDateOfAppointment(resultSet.getString("dateOfAppointment"));
                booking.setEntryDate(resultSet.getString("entryDate"));
                booking.setStatus(resultSet.getString("status"));
                booking.setVenue(resultSet.getString("venue"));
                booking.setBookingId(Integer.parseInt(resultSet.getString("bookingId")));

                bookings.add(booking);
            }
            return bookings;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public Booking getBookingById(String bookingId){
        try{
            Booking booking = new Booking();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from Booking where bookingId="+bookingId+";");
            if (resultSet.next()){
                booking.setUserID(Integer.parseInt(resultSet.getString("userID")));
                booking.setFullName(resultSet.getString("fullName"));
                booking.setPassportNumber(resultSet.getString("passportNumber"));
                booking.setMotherName(resultSet.getString("motherName"));
                booking.setFatherName(resultSet.getString("fatherName"));
                booking.setDateOfBirth(resultSet.getString("dateOfBirth"));
                booking.setTypeOfVisa(resultSet.getString("typeOfVisa"));
                booking.setDateOfAppointment(resultSet.getString("dateOfAppointment"));
                booking.setEntryDate(resultSet.getString("entryDate"));
                booking.setStatus(resultSet.getString("status"));
                booking.setVenue(resultSet.getString("venue"));
                booking.setBookingId(Integer.parseInt(resultSet.getString("bookingId")));
            }
            return booking;

        } catch (SQLException e) {
            return null;
        }
    }
}
