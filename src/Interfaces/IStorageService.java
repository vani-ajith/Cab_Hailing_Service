package Interfaces;

import Model.BookingModel;
import Model.DriverModel;
import Model.RiderModel;
import Model.VehicleInfoModel;

import java.util.List;

public interface IStorageService {

    boolean saveRider(RiderModel riderModel);
    boolean saveDriver(DriverModel driverModel);
    boolean saveVehicle(VehicleInfoModel vehicleInfoModel);
    boolean saveBookingDetails(BookingModel bookingModel);

    List<BookingModel> rideHistory(String riderUserId);
    VehicleInfoModel find(double lat,double lon);
    boolean updateLocation(VehicleInfoModel vehicleInfoModel);




}
