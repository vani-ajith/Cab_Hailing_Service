package interfaces;

import model.VehicleInfo;

public class VehicleServiceImpl implements IVehicleService{

    private static final double MAX_DISTANCE = 110D;
    IStorageService storageService;

    public VehicleServiceImpl(IStorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public boolean registerVehicle(VehicleInfo vehicleInfo) {
        storageService.saveVehicle(vehicleInfo);
        return true;
    }

    @Override
    public boolean updateLocation(VehicleInfo vehicleInfo) {
        storageService.updateLocation(vehicleInfo);
        return true;
    }

    @Override
    public VehicleInfo findVehicle(double latitude, double longitude) {
        VehicleInfo v = storageService.find(latitude,longitude,MAX_DISTANCE);
        if(v == null){
            System.out.println("Vehicle not found");
        }
        return v;
    }


}
