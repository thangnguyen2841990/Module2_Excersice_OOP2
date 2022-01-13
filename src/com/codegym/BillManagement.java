package com.codegym;

public class BillManagement {
    Bill[] bills = new Bill[0];


    public BillManagement() {

    }

    public BillManagement(Bill[] bills) {
        this.bills = bills;
    }


    public Bill[] getBills() {
        return bills;
    }

    public void setBills(Bill[] bills) {
        this.bills = bills;
    }

    public void addNewBill(int index, Bill newBill) {
        Bill[] newBills = new Bill[bills.length + 1];
        for (int i = 0; i < newBills.length; i++) {
            if (i < index) {
                newBills[i] = bills[i];
            } else if (i == index) {
                newBills[i] = newBill;
            } else {
                newBills[i] = bills[i - 1];
            }
        }
        this.bills = newBills;
    }

    public void showAllBill() {
        for (int i = 0; i < bills.length; i++) {
            System.out.println((i + 1) + ". " + bills[i]);
        }
    }
}
