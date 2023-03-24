
import interfaces.*;
import model.Booking;
import model.Driver;
import model.Rider;
import model.VehicleInfo;

import java.awt.print.Book;
import java.util.List;


public class CabHailingService{
    public static void main(String[] args) {

        IStorageService storageService = new StorageServiceImpl();
        IRiderService riderService = new RiderServiceImpl(storageService);
        IDriverService driverService = new DriverServiceImpl(storageService);
        IVehicleService vehicleService = new VehicleServiceImpl(storageService);
        IBookingService bookingService = new BookingServiceImpl(storageService,vehicleService);

        Rider rider = new Rider();
        rider.setName("Tom");
        rider.setCountryCode(91);
        rider.setPhoneNumber("111111111");
        riderService.register(rider);

        Driver driver = new Driver();
        driver.setName("Tom driver");
        driver.setCountryCode(91);
        driver.setPhoneNumber("1010101010");
        driverService.register(driver);

        VehicleInfo vehicleInfoRider = new VehicleInfo();
        vehicleInfoRider.setCarNumber("KA031234");
        vehicleInfoRider.setLatitude(1D);
        vehicleInfoRider.setLongitude(1D);
        vehicleService.registerVehicle(vehicleInfoRider);

        bookingService.book(24242,1D,2D);

        List<Booking> bookHistory = bookingService.rideHistory(24242);
        System.out.println("Booking history" + bookHistory);

    }
}
