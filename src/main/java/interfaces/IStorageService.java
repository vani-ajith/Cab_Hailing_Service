package interfaces;

import model.Booking;
import model.Driver;
import model.Rider;
import model.VehicleInfo;

import java.util.List;

public interface IStorageService {

    boolean saveRider(Rider riderModel);
    boolean saveDriver(Driver driver);
    boolean saveVehicle(VehicleInfo vehicleInfo);
    boolean updateLocation(VehicleInfo vehicleInfo);
    boolean saveBookingDetails(Booking booking);
    List<Booking> rideHistory(int riderUserId);
    VehicleInfo find(double lat, double lon,double radius);
    boolean endTrip(long timeStamp,String bookingId);



}
