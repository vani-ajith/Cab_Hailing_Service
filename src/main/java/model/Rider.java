package model;

import java.util.List;

public class Rider extends PersonalInfo {

    private List<String> bookingHistory;
//    public Rider(String name, String phoneNumber, int countryCode, int id) {
//        super(name, phoneNumber, countryCode, id);
//    }

    public List<String> getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(List<String> bookingHistory) {
        this.bookingHistory = bookingHistory;
    }
}
