package com.codegym;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        int choice;
        System.out.println("----Nhập thông tin khách hàng----");
        System.out.println("Nhập số lượng hộ dân sử dụng điện: ");
        size = scanner.nextInt();
        BienLai[] bienLai = new BienLai[size];
        for (int i = 0; i < bienLai.length; i++) {
            System.out.println("Nhập thông tin khách hàng thứ: " + (i + 1));
            bienLai[i] = inputPerson();
        }
        showAll(bienLai);
    }

    public static void menu() {
        System.out.println("Menu: ");
        System.out.println("1. Nhập thông tin khách hàng ");
        System.out.println("2. Hiển thị thông tin khách hàng ");
    }

    public static BienLai inputPerson() {
        scanner.nextLine();
        System.out.println("Nhập tên chủ hộ");
        String name = scanner.nextLine();
        System.out.println("Nhập số nhà: ");
        int number = scanner.nextInt();
        System.out.println("Nhập mã số công tơ: ");
        int code = scanner.nextInt();
        System.out.println("Nhập chỉ số công tơ cũ: ");
        int oldIndex = scanner.nextInt();
        System.out.println("Nhập chỉ số công tơ mới: ");
        int newIndex = scanner.nextInt();
        return new BienLai(name, number, code, oldIndex, newIndex);
    }

    public static void showAll(BienLai[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
