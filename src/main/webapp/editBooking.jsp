<%@ include file="afterLoginNavbar.jsp"%>
<%@ include file="links.jsp"%>
<%@ page import="service.BookingService" %>
<%@ page import="model.Booking" %>
<%@ page import="java.util.List" %>
<%
    String bookingId = request.getParameter("bookingId");
    BookingService bookingService = new BookingService();
    Booking booking = bookingService.getBookingById(bookingId);
%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
   <script>
           $( function() {
             $('#datepicker').datepicker({
                    dateFormat: 'yy-mm-dd',
                    minDate: new Date()
                });
           } );

            $( function() {
                $('#entryDate').datepicker({
                       dateFormat: 'yy-mm-dd',
                       minDate: new Date()
                   });
            } );

            $( function() {
                $('#dateOfBirth').datepicker({
                       dateFormat: 'yy-mm-dd'

                   });
            } );
   </script>
  <style>

    .container {
      background-color: #fff;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
    }

  </style>
</head>
<body>
  <div class="container mt-5">
    <h2>Update Booking Details</h2>
    <form action="editBooking" method="get">
    <input type="hidden" name="bookingId" value="<%=request.getParameter("bookingId")%>">
      <div class="form-group">
        <label for="fullName">Full Name</label>
        <input type="text" class="form-control" id="fullName" name="fullName" value="<%=booking.getFullName()%>" required>
      </div>
      <div class="form-group">
        <label for="passportNumber">Passport Number</label>
        <input type="text" class="form-control" id="passportNumber" name="passportNumber" value="<%=booking.getPassportNumber()%>" required>
      </div>
      <div class="form-group">
        <label for="motherName">Mother's Name</label>
        <input type="text" class="form-control" id="motherName" name="motherName" value="<%=booking.getMotherName()%>" required>
      </div>
      <div class="form-group">
        <label for="fatherName">Father's Name</label>
        <input type="text" class="form-control" id="fatherName" name="fatherName" value="<%=booking.getFatherName()%>" required>
      </div>
      <div class="form-group">
        <label for="typeOfVisa">Type of Visa</label>
        <div class="dropdown">
          <select class="form-control dropdown-toggle" id="typeOfVisa" name="typeOfVisa" required>
            <option value="">Select Visa Type</option>
            <option value="Tourist Visa" <%= booking.getTypeOfVisa().equals("Tourist Visa") ? "selected" : "" %>>Tourist Visa</option>
            <option value="Business Visa" <%= booking.getTypeOfVisa().equals("Business Visa") ? "selected" : "" %>>Business Visa</option>
            <option value="Student Visa" <%= booking.getTypeOfVisa().equals("Student Visa") ? "selected" : "" %>>Student Visa</option>
            <option value="Work Visa" <%= booking.getTypeOfVisa().equals("Work Visa") ? "selected" : "" %>>Work Visa</option>
            <option value="Transit Visa" <%= booking.getTypeOfVisa().equals("Transit Visa") ? "selected" : "" %>>Transit Visa</option>
          </select>
        </div>
      </div>
      <div class="form-group">
        <label for="dateOfAppointment">Date of Appointment</label>
        <input type="text" class="form-control" id="datepicker" name="dateOfAppointment" value="<%=booking.getDateOfAppointment()%>" required>
      </div>
      <div class="form-group">
        <label for="entryDate">Entry Date</label>
        <input type="text" class="form-control datepicker" id="entryDate" name="entryDate" value="<%=booking.getEntryDate()%>" required>
      </div>
      <div class="form-group">
          <label for="dateOfBirth">Date of Birth</label>
          <input type="text" class="form-control datepicker" id="dateOfBirth" name="dateOfBirth" value="<%=booking.getDateOfBirth()%>" required>
        </div>
      <div class="form-group">
          <label for="venue">Venue</label>
          <select class="form-control" id="venue" name="venue" data-toggle="dropdown" value="<%=booking.getVenue()%>" required>

              <option value="Hyderabad,India" <%= (booking.getVenue() != null && booking.getVenue().equals("Hyderabad, India")) ? "selected" : "" %>>Hyderabad, India</option>
              <option value="Chennai,India" <%= (booking.getVenue() != null && booking.getVenue().equals("Chennai, India")) ? "selected" : "" %>>Chennai, India</option>
              <option value="Mumbai,India" <%= (booking.getVenue() != null && booking.getVenue().equals("Mumbai, India")) ? "selected" : "" %>>Mumbai, India</option>
              <option value="London,UK" <%= (booking.getVenue() != null && booking.getVenue().equals("London, UK")) ? "selected" : "" %>>London, UK</option>
              <option value="Paris,France" <%= (booking.getVenue() != null && booking.getVenue().equals("Paris, France")) ? "selected" : "" %>>Paris, France</option>
              <option value="Sydney,Australia" <%= (booking.getVenue() != null && booking.getVenue().equals("Sydney, Australia")) ? "selected" : "" %>>Sydney, Australia</option>
              <option value="Dubai,UAE" <%= (booking.getVenue() != null && booking.getVenue().equals("Dubai, UAE")) ? "selected" : "" %>>Dubai, UAE</option>
          </select>
      </div>
      <button type="submit" class="btn btn-primary" value="submit">Submit</button>
    </form>
  </div>
</body>
</html>
