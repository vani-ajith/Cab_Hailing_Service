package interfaces;

import model.Booking;
import model.VehicleInfo;

import java.util.List;
import java.util.UUID;

public class BookingServiceImpl implements IBookingService{

    IStorageService storageService;
    IVehicleService vehicleService;

    public BookingServiceImpl(IStorageService storageService,IVehicleService vehicleService) {
        this.storageService = storageService;
        this.vehicleService = vehicleService;
    }

    @Override
    public List<Booking> rideHistory(int riderId) {
        return storageService.rideHistory(riderId);
    }

    @Override
    public Booking book(int riderUserId, Double lat, Double lon) {

        VehicleInfo vehicleInfo = vehicleService.findVehicle(lat,lon);
        Booking booking = new Booking();
        booking.setBookingId(UUID.randomUUID().toString());
        booking.setRiderUserId(riderUserId);
        booking.setCarNumber(vehicleInfo.getCarNumber());
        storageService.saveBookingDetails(booking);
        return booking;
    }

    @Override
    public Boolean endTrip(Long timeStamp, String bookingId) {
         storageService.endTrip(timeStamp,bookingId);
         return true;
    }
}
