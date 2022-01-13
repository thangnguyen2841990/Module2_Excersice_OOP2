package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        BillManagement billManagement = new BillManagement();
        menu();
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            if (choice > 2) {
                System.out.println("Menu chỉ có từ 1=>2");
            }
            switch (choice) {
                case 1: {
                    System.out.println("----Hiển thị thông tin biên lai----");
                    billManagement.showAllBill();
                    break;
                }
                case 2: {
                    System.out.println("----NHập biên lai----");
                    System.out.println("Nhập vị trí nhập biên lai: ");
                    int index = scanner.nextInt();
                    if (index - 1 < 0 || index - 1 > billManagement.bills.length) {
                        System.out.println("Vị trí không hợp lệ");
                    } else {
                        Bill newBill = inputCustomerInfo();
                        billManagement.addNewBill(index - 1,newBill );
                    }

                    break;
                }
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("MENU QUẢN LÝ KHÁCH HÀNG: ");
        System.out.println("1. Hiển thị thông tin biên lai ");
        System.out.println("2. Nhập biên lai ");
        System.out.println("0. Thoát");

    }

    public static Bill inputCustomerInfo() {
        scanner.nextLine();
        System.out.println("Nhập tên chủ hộ");
        String name = scanner.nextLine();
        System.out.println("Nhập số nhà: ");
        int address = scanner.nextInt();   // address
        System.out.println("Nhập mã số công tơ: ");
        int code = scanner.nextInt();
        System.out.println("Nhập chỉ số công tơ cũ: ");
        int oldIndex = scanner.nextInt();
        System.out.println("Nhập chỉ số công tơ mới: ");
        int newIndex = scanner.nextInt();
        return new Bill(oldIndex,newIndex,new Customer(name,address,code));
    }


}

