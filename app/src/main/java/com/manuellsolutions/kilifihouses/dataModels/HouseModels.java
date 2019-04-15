package com.manuellsolutions.kilifihouses.dataModels;

public class HouseModels {

    int houseImageUrl;
    String houseNumber;
    String houseContactName;
    String houseContactNumber;
    String housePrice;


    public HouseModels() {
    }

    public HouseModels(int houseImageUrl, String houseNumber, String houseContactName, String houseContactNumber, String housePrice) {
        this.houseImageUrl = houseImageUrl;
        this.houseNumber = houseNumber;
        this.houseContactName = houseContactName;
        this.houseContactNumber = houseContactNumber;
        this.housePrice = housePrice;
    }

    public int getHouseImageUrl() {
        return houseImageUrl;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getHouseContactName() {
        return houseContactName;
    }

    public String getHouseContactNumber() {
        return houseContactNumber;
    }

    public String getHousePrice() {
        return housePrice;
    }
}
