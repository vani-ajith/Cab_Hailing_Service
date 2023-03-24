package interfaces;

import model.Booking;
import model.Driver;
import model.Rider;
import model.VehicleInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StorageServiceImpl implements IStorageService {

    public static final String COMPLETED = "COMPLETED";
    HashMap<Integer, Rider> rider;
    HashMap<Integer, Driver> driver;
    HashMap<String, VehicleInfo> vehicleInfoMap;
    HashMap<String, Booking> bookingMap;
    List<Booking> bookingList;

    public StorageServiceImpl() {
        rider = new HashMap<>();
        driver = new HashMap<>();
        vehicleInfoMap = new HashMap<>();
        bookingMap = new HashMap<>();
    }

    @Override
    public boolean saveRider(Rider riderModel) {
        if(!rider.containsKey(riderModel.getId())){
            rider.put(riderModel.getId(),riderModel);
        }else{
            return false;
        }
        return true;
    }

    @Override
    public boolean saveDriver(Driver driver) {
        if(!this.driver.containsKey(driver.getId())){
            this.driver.put(driver.getId(), driver);
        }else{
            return false;
        }
        return true;
    }

    @Override
    public boolean saveVehicle(VehicleInfo vehicleInfo) {
        if(!this.vehicleInfoMap.containsKey(vehicleInfo.getCarNumber())){
            this.vehicleInfoMap.put(vehicleInfo.getCarNumber(), vehicleInfo);
        }else{
            return false;
        }
        return true;
    }

    @Override
    public boolean updateLocation(VehicleInfo vehicleInfo) {
        String carNum = vehicleInfo.getCarNumber();
        if(vehicleInfoMap.containsKey(carNum)){                             // this.vehicleInfoMap changed to vehicleInfoMap
            vehicleInfoMap.put(vehicleInfo.getCarNumber(), vehicleInfo);
        }else{
            return false;
        }
        return true;
    }


    @Override
    public boolean saveBookingDetails(Booking booking) {
        if(!bookingMap.containsKey(booking.getBookingId())){
            bookingMap.put(booking.getBookingId(), booking);
        }
        return true;
    }


    @Override
    public List<Booking> rideHistory(int riderUserId) {
        bookingList = new ArrayList<>();
        for(String id : bookingMap.keySet()){
            Booking temp = bookingMap.get(id);
            if(temp.getBookingId().equals(riderUserId)){
                bookingList.add(temp);
                return bookingList;
            }
        }

        return null;
    }

    @Override
    public VehicleInfo find(double lat, double lon,double radius) {
        return null;
    }

    @Override
    public boolean endTrip(long timeStamp, String bookingId) {
        return false;
    }


}
