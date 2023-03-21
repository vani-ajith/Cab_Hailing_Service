package Interfaces;

import Model.VehicleInfoModel;

public class VehicleServiceImpl implements IVehicleService{

    IStorageService storageService;

    public VehicleServiceImpl(IStorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public boolean registerVehicle(VehicleInfoModel vehicleInfoModel) {
        storageService.saveVehicle(vehicleInfoModel);
        return true;
    }


    @Override
    public boolean updateLocation(VehicleInfoModel vehicleInfoModel) {
        return false;
    }

    @Override
    public VehicleInfoModel findVehicle(double latitude, double longitude,double radius) {
        VehicleInfoModel v = storageService.find(latitude,longitude);
        if(v == null){
            System.out.println("Vehicle not found");
        }
        return v;
    }


}
