package Model;

public class VehicleInfoModel {

    private String carNumber;
    private String latitude;
    private String longitude;
    private String carType;
    private boolean isAvailable;
    private int driverId;

    public VehicleInfoModel(String carNumber, String latitude, String longitude, String carType, boolean isAvailable, int driverId) {
        this.carNumber = carNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.carType = carType;
        this.isAvailable = isAvailable;
        this.driverId = driverId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
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
