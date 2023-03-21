package Model;

public abstract class  PersonalInfoModel{

    private String name;
    private String phoneNumber;
    private int countryCode;
    private int id;

    public PersonalInfoModel(String name, String phoneNumber, int countryCode, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
        this.id = id;
    }

    public PersonalInfoModel(String name, String phoneNumber, int countryCode) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
