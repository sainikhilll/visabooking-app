<%
	String role = (String)session.getAttribute("role");
if(role == null){%>
	<%@ include file="navbar.jsp"%>
<%}else if(role.equalsIgnoreCase("User")){%>
	<%@ include file="afterLoginNavbar.jsp"%>
<%}%>
<%
	String msg = request.getParameter("msg");
%>
<div class="row">
	<div class="col-md-4"></div>
		<div class="col-md-4 mt-5">
			<div class="alert alert-info">
		    	<strong><%=msg%></strong>
		   	</div>
	   	</div>
	 </div>
<div class="col-md-4"></div>