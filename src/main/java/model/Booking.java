package model;

public class Booking {
    private int bookingId;
    private String fullName;
    private String passportNumber;
    private String motherName;
    private String fatherName;
    private String dateOfBirth;
    private String typeOfVisa;
    private String dateOfAppointment;
    private String entryDate;


    private int userID;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Booking(int bookingId, String fullName, String passportNumber, String motherName, String fatherName, String dateOfBirth, String typeOfVisa, String dateOfAppointment, String entryDate, String status, String venue, int userId) {
        this.bookingId = bookingId;
        this.fullName = fullName;
        this.passportNumber = passportNumber;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.typeOfVisa = typeOfVisa;
        this.dateOfAppointment = dateOfAppointment;
        this.entryDate = entryDate;
        this.status = status;
        this.venue = venue;
        this.userId = userId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private String status;

    private String venue;
    private int userId;

    public Booking() {
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getTypeOfVisa() {
        return typeOfVisa;
    }

    public void setTypeOfVisa(String typeOfVisa) {
        this.typeOfVisa = typeOfVisa;
    }

    public String getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(String dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Bokking{" +
                "bookingId=" + bookingId +
                ", fullName='" + fullName + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", typeOfVisa='" + typeOfVisa + '\'' +
                ", dateOfAppointment='" + dateOfAppointment + '\'' +
                ", entryDate='" + entryDate + '\'' +
                ", status='" + status + '\'' +
                ", venue='" + venue + '\'' +
                ", userId=" + userId +
                '}';
    }

}
