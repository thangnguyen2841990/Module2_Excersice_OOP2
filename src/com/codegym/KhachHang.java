package com.codegym;

public class KhachHang {
    private String name;
    private int apartmentNumber;
    private int meterCodeNumber;

    public KhachHang() {
    }

    public KhachHang(String name, int apartmentNumber, int meterCodeNumber) {
        this.name = name;
        this.apartmentNumber = apartmentNumber;
        this.meterCodeNumber = meterCodeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getMeterCodeNumber() {
        return meterCodeNumber;
    }

    public void setMeterCodeNumber(int meterCodeNumber) {
        this.meterCodeNumber = meterCodeNumber;
    }

    @Override
    public String toString() {
        return "Chủ hộ: " + getName() + ", Số nhà: " + getApartmentNumber() + ", Mã số công tơ: " + getMeterCodeNumber();
    }
}
