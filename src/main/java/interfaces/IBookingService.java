package interfaces;

import model.Booking;

import java.util.List;

public interface IBookingService {

    List<Booking> rideHistory (int riderId);
    Booking book(int riderUserId, Double lat, Double lon);
    Boolean endTrip(Long timeStamp, String bookingId);

}
