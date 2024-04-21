<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="afterLoginNavbar.jsp"%>
<%@ include file="links.jsp"%>
<%@ page import="service.BookingService" %>
<%@ page import="model.Booking" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bookings</title>
<!-- Bootstrap CSS -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        padding: 20px;
    }
</style>
</head>
<body>
    <div class="container">
        <h2>Bookings</h2>
        <table class="table">
            <thead>
                <tr>
                    <th>Booking ID</th>
                    <th>Name</th>
                    <th>Date</th>
                    <th>Venue</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                    String userID = (String) session.getAttribute("userId");
                    BookingService bookingService = new BookingService();
                    List<Booking> bookings = bookingService.getBookingsByUserId(userID);
                    for (Booking booking : bookings) {
                %>
                <tr>
                    <td><%= booking.getBookingId() %></td>
                    <td><%= booking.getFullName() %></td>
                    <td><%= booking.getDateOfAppointment() %></td>
                    <td><%= booking.getVenue() %></td>
                    <td><%= booking.getStatus() %></td>
                    <td>
                       <a href="editBooking.jsp?bookingId=<%= booking.getBookingId() %>" class="btn btn-primary">Edit</a>
                       <a href="delete?bookingId=<%= booking.getBookingId() %>" class="btn btn-danger">Delete</a>
                   </td>

                </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</body>
</html>
