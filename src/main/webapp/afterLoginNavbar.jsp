<%@ include file="links.jsp" %>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #003875;"> <!-- Changed bg-light to custom background color -->
  <div class="container-fluid">
    <a class="nav-link text-white" href="index.jsp"><img src="ucm.jpeg" alt="Image" style="height: 75px; width: 75px;"></a>
    <a class="nav-link text-white me-5 p-3 fs-1 fw-bold" href="about.jsp">UCM Embassy and Immigrations</a>
    <div class="navbar-nav me-auto">
      <%@ include file="links.jsp" %>
    </div>
    <div class="navbar-nav">
      <a class="nav-link text-white fs-3" href="book.jsp"> Book Slot </a> <!-- Added text-white class for white text -->
    </div>
     <div class="navbar-nav">
          <a class="nav-link text-white fs-3" href="viewBookings.jsp"> View Bookings </a> <!-- Added text-white class for white text -->
     </div>
     <div class="navbar-nav">
               <a class="nav-link text-white fs-3" href="logout.jsp">Logout </a> <!-- Added text-white class for white text -->
     </div>

  </div>
</nav>
