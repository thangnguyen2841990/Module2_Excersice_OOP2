package com.codegym;

public class BienLai extends KhachHang {
    private int oldIndex;
    private int newIndex;

    public BienLai() {
    }

    public BienLai(int oldIndex, int newIndex) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public BienLai(String name, int apartmentNumber, int meterCodeNumber, int oldIndex, int newIndex) {
        super(name, apartmentNumber, meterCodeNumber);
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public double getMoney() {
        return (getNewIndex() - getOldIndex()) * 750;
    }

    @Override
    public String toString() {
        return "Thông tin về hộ sử dụng điện: " + super.toString() + "\n" +
                "Chỉ số cũ: " + getOldIndex() + ", Chỉ số mới: " + getNewIndex() + ", Số tiền phải nộp: " + getMoney()+"(VND)";
    }
}
