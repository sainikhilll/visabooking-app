<%@ include file="afterLoginNavbar.jsp"%>
<%@ include file="links.jsp"%>
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
    body {
      background-color: #f8f9fa;
    }
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
    <h2>Visa Booking Form</h2>
    <form action="book" method="get">
      <div class="form-group">
        <label for="fullName">Full Name</label>
        <input type="text" class="form-control" id="fullName" name="fullName" required>
      </div>
      <div class="form-group">
        <label for="passportNumber">Passport Number</label>
        <input type="text" class="form-control" id="passportNumber" name="passportNumber" required>
      </div>
      <div class="form-group">
        <label for="motherName">Mother's Name</label>
        <input type="text" class="form-control" id="motherName" name="motherName" required>
      </div>
      <div class="form-group">
        <label for="fatherName">Father's Name</label>
        <input type="text" class="form-control" id="fatherName" name="fatherName" required>
      </div>
      <div class="form-group">
        <label for="typeOfVisa">Type of Visa</label>
        <div class="dropdown">
          <select class="form-control dropdown-toggle" id="typeOfVisa" name="typeOfVisa" required>
            <option value="">Select Visa Type</option>
            <option value="Tourist Visa">Tourist Visa</option>
            <option value="Business Visa">Business Visa</option>
            <option value="Student Visa">Student Visa</option>
            <option value="Work Visa">Work Visa</option>
            <option value="Transit Visa">Transit Visa</option>
          </select>
        </div>
      </div>
      <div class="form-group">
        <label for="dateOfAppointment">Date of Appointment</label>
        <input type="text" class="form-control" id="datepicker" name="dateOfAppointment" required>
      </div>
      <div class="form-group">
        <label for="entryDate">Entry Date</label>
        <input type="text" class="form-control datepicker" id="entryDate" name="entryDate" required>
      </div>
      <div class="form-group">
          <label for="entryDate">Date of Birth</label>
          <input type="text" class="form-control datepicker" id="dateOfBirth" name="dateOfBirth" required>
        </div>
      <div class="form-group">
        <label for="venue">Venue</label>
        <select class="form-control" id="venue" name="venue" data-toggle="dropdown" required>
          <option value="">Select Venue</option>
          <option value="Hyderabad,India">Hyderabad, India</option>
          <option value="Chennai,India">Chennai, India</option>
          <option value="Mumbai,India">Mumbai, India</option>
          <option value="London,UK">London, UK</option>
          <option value="Paris,France">Paris, France</option>
          <option value="Sydney,Australia">Sydney, Australia</option>
          <option value="Dubai,UAE">Dubai, UAE</option>
        </select>
      </div>
      <button type="submit" class="btn btn-primary" value="submit">Submit</button>
    </form>
  </div>


</body>
</html>