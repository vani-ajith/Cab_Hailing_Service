package Interfaces;

import Model.BookingModel;
import Model.DriverModel;
import Model.RiderModel;
import Model.VehicleInfoModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StorageServiceImpl implements IStorageService {

    HashMap<Integer,RiderModel> rider;
    HashMap<Integer,DriverModel> driver;
    HashMap<String,VehicleInfoModel> vehicleInfo;
    HashMap<String,BookingModel> booking;
    List<BookingModel> bookingList;


    public StorageServiceImpl() {
        rider = new HashMap<>();
        driver = new HashMap<>();
        vehicleInfo = new HashMap<>();
        booking = new HashMap<>();
        bookingList = new ArrayList<>();
    }

    @Override
    public boolean saveRider(RiderModel riderModel) {
        if(!rider.containsKey(riderModel.getId())){
            rider.put(riderModel.getId(),riderModel);
        }else{
            return false;
        }
        return true;
    }

    @Override
    public boolean saveDriver(DriverModel driverModel) {
        if(!driver.containsKey(driverModel.getId())){
            driver.put(driverModel.getId(),driverModel);
        }else{
            return false;
        }
        return true;
    }

    @Override
    public boolean saveVehicle(VehicleInfoModel vehicleInfoModel) {
        if(!vehicleInfo.containsKey(vehicleInfoModel.getCarNumber())){
            vehicleInfo.put(vehicleInfoModel.getCarNumber(), vehicleInfoModel);
        }else{
            return false;
        }
        return true;
    }

    @Override
    public boolean updateLocation(VehicleInfoModel vehicleInfoModel) {
        String carNum = vehicleInfoModel.getCarNumber();
        if(vehicleInfo.containsKey(carNum)){
            vehicleInfo.put(vehicleInfoModel.getCarNumber(),vehicleInfoModel);
        }else{
            return false;
        }
        return true;
    }


    @Override
    public boolean saveBookingDetails(BookingModel bookingModel) {
        if(!booking.containsKey(bookingModel.getBookingId())){
            booking.put(bookingModel.getBookingId(),bookingModel);
        }
        return true;
    }


    @Override
    public List<BookingModel> rideHistory(String riderUserId) {
        bookingList = new ArrayList<>();
        for(String id : booking.keySet()){
            BookingModel temp = booking.get(id);
            if(temp.getBookingId().equals(riderUserId)){
                bookingList.add(temp);
                return bookingList;
            }
        }

        return null;
    }

    @Override
    public VehicleInfoModel find(double lat, double lon) {
        return null;
    }





}
