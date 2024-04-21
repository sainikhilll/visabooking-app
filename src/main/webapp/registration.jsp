<%@ include file="navbar.jsp"%>
<%@ include file="links.jsp"%>
<div class="row justify-content-center">
    <div class="col-md-8 mt-5">
        <div class="card p-4">
            <div class="card-body">
                <div class="text-center h4 text-grey mb-4">Register</div>
                <form action="user" method="get">
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label class="form-label text-grey">First Name</label>
                            <input type="text" name="firstName" class="form-control" required>
                        </div>
                        <div class="col-md-6">
                            <label class="form-label text-grey">Last Name</label>
                            <input type="text" name="lastName" class="form-control" required>
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label class="form-label text-grey">Email</label>
                            <input type="email" name="email" class="form-control" required>
                        </div>
                        <div class="col-md-6">
                            <label class="form-label text-grey">Phone</label>
                            <input type="number" name="phone" class="form-control" required>
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col-md-12">
                            <label class="form-label text-grey">Address</label>
                            <input type="text" name="address" class="form-control" required>
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label class="form-label text-grey">Country of Residence</label>
                            <input type="text" name="countryOfResidence" class="form-control" required>
                        </div>
                        <div class="col-md-6">
                            <label class="form-label text-grey">Password</label>
                            <input type="password" name="password" class="form-control" required>
                        </div>
                    </div>
                    <div class="text-center">
                        <input type="submit" class="btn btn-secondary" value="Signup">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
