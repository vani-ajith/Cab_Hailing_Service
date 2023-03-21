package Interfaces;

import Model.BookingModel;

import java.util.List;

public class BookingServiceImpl implements IBookingService{

    IStorageService storageService;

    public BookingServiceImpl(IStorageService storageService) {
        this.storageService = storageService;

    }

    @Override
    public List<BookingModel> rideHistory(String riderId) {
        return storageService.rideHistory(riderId);
    }
}
