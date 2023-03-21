package Interfaces;

import Model.RiderModel;

public class RiderServiceImpl implements IRiderService{

    IStorageService storageService;

    public RiderServiceImpl(IStorageService storageService){
        this.storageService = storageService;
    }

    @Override
    public boolean register(RiderModel riderModel) {
            storageService.saveRider(riderModel);
        return true;
    }
}
