package model;

public class VehicleInfo {

    private String carNumber;
    private double latitude;
    private double longitude;
    private String carType;
    private boolean isAvailable;
    private int driverId;

//    public VehicleInfo(String carNumber, String latitude, String longitude, String carType, boolean isAvailable, int driverId) {
//        this.carNumber = carNumber;
//        this.latitude = latitude;
//        this.longitude = longitude;
//        this.carType = carType;
//        this.isAvailable = isAvailable;
//        this.driverId = driverId;
//    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }
}
