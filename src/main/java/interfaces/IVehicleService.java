package interfaces;

import model.VehicleInfo;

public interface IVehicleService {

    boolean registerVehicle(VehicleInfo vehicleInfo);
    boolean updateLocation(VehicleInfo vehicleInfo);
    VehicleInfo findVehicle(double latitude, double longitude);


}
