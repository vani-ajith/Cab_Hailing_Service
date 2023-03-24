package interfaces;

import model.Rider;

public class RiderServiceImpl implements IRiderService{

    IStorageService storageService;

    public RiderServiceImpl(IStorageService storageService){
        this.storageService = storageService;
    }

    @Override
    public boolean register(Rider rider) {
        storageService.saveRider(rider);
        return true;
    }
}
