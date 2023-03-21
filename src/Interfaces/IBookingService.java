package Interfaces;

import Model.BookingModel;

import java.util.List;

public interface IBookingService {

    List<BookingModel> rideHistory (String riderId);

}
