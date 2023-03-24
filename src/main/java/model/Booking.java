package model;

public class Booking {

    private String bookingId;
    private int riderUserId;
    private String carNumber;
    private String startTime;
    private String endTime;
    private String status;

//    public Booking(String bookingId, int riderUserId, String carNumber, String startTime, String endTime, String status) {
//        bookingId = bookingId;
//        this.riderUserId = riderUserId;
//        this.carNumber = carNumber;
//        this.startTime = startTime;
//        this.endTime = endTime;
//        status = status;
//    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        bookingId = bookingId;
    }

    public int getRiderUserId() {
        return riderUserId;
    }

    public void setRiderUserId(int riderUserId) {
        this.riderUserId = riderUserId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }
}
