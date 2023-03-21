package Model;

public class BookingModel {

    private String BookingId;
    private int riderUserId;
    private String carNumber;
    private String startTime;
    private String endTime;
    private String Status;

    public BookingModel(String bookingId, int riderUserId, String carNumber, String startTime, String endTime, String status) {
        BookingId = bookingId;
        this.riderUserId = riderUserId;
        this.carNumber = carNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        Status = status;
    }

    public String getBookingId() {
        return BookingId;
    }

    public void setBookingId(String bookingId) {
        BookingId = bookingId;
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
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
