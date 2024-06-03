package models;

public class Office {

    private String officeCode;
    private String city;
    private int phone;
    private String address;
    private String country ;


    public Office() {
    }


    public Office(String officeCode, String city, int phone, String address, String country) {
        this.officeCode = officeCode;
        this.city = city;
        this.phone = phone;
        this.address = address;
        this.country = country;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
