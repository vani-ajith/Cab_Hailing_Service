package Interfaces;

import Model.DriverModel;

public class DriverServiceImpl implements IDriverService{

    IStorageService storageService;

    public DriverServiceImpl(IStorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public boolean register(DriverModel driverModel) {
        storageService.saveDriver(driverModel);
        return true;
    }
}
