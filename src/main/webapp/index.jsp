<%@ include file="navbar.jsp"%>
<%@ include file="links.jsp"%>
<div class="row justify-content-center align-items-center">
    <div class="col-md-6 mt-5 pt-5">
        <div class="card text-center">
            <div class="card-header fs-2 fw-bold">
                Login
            </div>
            <div class="card-body">
                <form action="user" method="post">
                    <div class="form-floating mb-3 mt-3">
                        <input type="email" name="email" id="email" class="form-control" placeholder="Enter Email" required>
                        <label for="email">Email</label>
                    </div>
                    <div class="form-floating mb-3 mt-3">
                        <input type="password" name="password" id="password" class="form-control" placeholder="Enter Password" required>
                        <label for="password">Password</label>
                    </div>
                    <div>
                        <input type="submit" class="btn btn-primary w-80" value="Login" style="background-color: #003875;">
                    </div>
                    <div class="mt-3">
                        <a href="registration.jsp">Register</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
