package Interfaces;

import Model.VehicleInfoModel;

public interface IVehicleService {

    boolean registerVehicle(VehicleInfoModel vehicleInfoModel);
    boolean updateLocation(VehicleInfoModel vehicleInfoModel);
    VehicleInfoModel findVehicle(double latitude,double longitude,double radius);


}
