package interfaces;

import model.Driver;

public class DriverServiceImpl implements IDriverService{

    IStorageService storageService;

    public DriverServiceImpl(IStorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public boolean register(Driver driver) {
        storageService.saveDriver(driver);
        return true;
    }
}
