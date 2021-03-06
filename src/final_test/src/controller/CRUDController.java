package controller;

import commons.PersonException;
import commons.ReadAndWrite;
import commons.Validation;
import models.ConNguoi;

import java.util.List;
import java.util.Scanner;

public interface CRUDController {
     Scanner scanner = new Scanner(System.in);




    public static int themMaHS()  {
        int ma ;
            List<ConNguoi> list= ReadAndWrite.readFileObject("students.csv");
                if (list.isEmpty()) {
                    return ma=1;
                } else {
                    return ma=list.size();
                }

    }



    public static String themHoTen() {
        String hoTen = "";
        do {
            try {
                System.out.println("Nhập họ tên: ");
                hoTen = scanner.nextLine();
                Validation.kiemTraTen(hoTen);
                hoTen = Validation.chuanHoaTen(hoTen);
                return hoTen;
            } catch (PersonException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    public static String themNgaySinh() {
        String ngaySinh = "";
        do {
            try {
                System.out.println("Nhập ngày sinh ");
                ngaySinh = scanner.nextLine();
                Validation.kiemTraNgaySinh(ngaySinh);
                return ngaySinh;
            } catch (PersonException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    public static String themSoDienThoai() {
        String soDienThoai ;
        do {
            try {
                System.out.println("Nhập số điện thoại: ");
                soDienThoai = scanner.nextLine();
                Validation.kiemTraSoDienThoai(soDienThoai);
                Validation.kiemTraSoDienThoaiDuyNhat(soDienThoai);
                return soDienThoai;
            } catch (PersonException e) {
                System.err.println("Nhập sai định dạng hoặc trùng lặp: (09xxxxxxxx)");
            }

        } while (true);
    }

    public static String themLop() {
        String lop = "";
        do {
            System.out.println("Nhập lớp: ");
            lop = scanner.nextLine();
        }while (!Validation.checkTonTai(lop));
                return lop;

    }
}
