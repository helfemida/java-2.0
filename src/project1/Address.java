package project1;

public class Address {
    private String state;
    private String distinct;
    private String city;
    private String street;
    private int doorNumber;

    public Address(String state, String distinct, String city, String street, int doorNumber) {
        this.state = state;
        this.distinct = distinct;
        this.city = city;
        this.street = street;
        this.doorNumber = doorNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistinct() {
        return distinct;
    }

    public void setDistinct(String distinct) {
        this.distinct = distinct;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "Address info: " +
                "state='" + state +
                ", distinct='" + distinct +
                ", city='" + city +
                ", street='" + street +
                ", doorNumber=" + doorNumber;
    }
}