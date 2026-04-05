package QLNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien {

    private ArrayList<NhanVien> arrNhanVien;
    private String maNV;
    private String hoTen;
    private double luongCB;
    private double hsLuong;
    private int pos;

    Scanner scanner = new Scanner(System.in);

    public NhanVien() {

        this.maNV = "";
        this.hoTen = "";
        this.luongCB = 0;
        this.hsLuong = 0;
        arrNhanVien = new ArrayList<>();
    }

    public NhanVien(String maNV, String hoTen, double luongCB, double hsLuong) {

        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.hsLuong = hsLuong;
        arrNhanVien = new ArrayList<>();
    }

    public String getMaNV() {
        return this.maNV;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public double getLuongCB() {
        return this.luongCB;
    }

    public double getHsLuong() {
        return this.hsLuong;
    }

    public void setMaNV(String maNV) {
        if(!(maNV.trim().isEmpty())) {
            this.maNV = maNV;
        }
    }

    public void setHoTen(String hoTen) {
        if(!(hoTen.trim().isEmpty())) {
            this.hoTen = hoTen;
        }
    }

    public void setLuongCB(long luongCB) {
        if(!(luongCB < 0)) {
            this.luongCB = luongCB;
        }
    }

    public void setHsLuong(double hsLuong) {
        if(!(hsLuong < 0)) {
            this.hsLuong = hsLuong;
        }
    }

    public double tinhLuong() {
        return luongCB * hsLuong + luongCB;
    }

    public void xepLoai() {
        if(tinhLuong() >= 20000000) {
            System.out.print("Xuat sac");
        } else if(tinhLuong() >= 15000000) {
            System.out.print("Tot");
        } else {
            System.out.print("Kha");
        }
    }

    public void nhap(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("+ NHAP THONG TIN NHAN VIEN " + (i + 1));
            System.out.print("- Vui long nhap maNV: ");
            maNV = scanner.nextLine();
            System.out.print("- Vui long nhap hoTen: ");
            hoTen = scanner.nextLine();
            System.out.print("- Vui long nhap luongCB: ");
            luongCB = scanner.nextDouble();
            System.out.print("- Vui long nhap hsLuong: ");
            hsLuong = scanner.nextDouble();
            scanner.nextLine();
            arrNhanVien.add(new NhanVien(maNV, hoTen, luongCB, hsLuong));
        }
    }

    public void xuat() {
        for(int i = 0; i < arrNhanVien.size(); i++) {
            System.out.println("+ XUAT THONG TIN NHAN VIEN " + (i + 1));
            System.out.println("- maNV: " + arrNhanVien.get(i).getMaNV());
            System.out.println("- hoTen: " + arrNhanVien.get(i).getHoTen());
            System.out.println("- luongCB: " + arrNhanVien.get(i).getLuongCB());
            System.out.println("- hsLuong: " + arrNhanVien.get(i).getHsLuong());
            System.out.println("- Luong: " + arrNhanVien.get(i).tinhLuong());
        }
    }

    public double tinhTongLuong() {
        double tongLuong = 0;
        for(int i = 0; i < arrNhanVien.size(); i++) {
            tongLuong += arrNhanVien.get(i).tinhLuong();
        }

        return tongLuong;
    }

    public void checkPos() {
        double max = 0;
        for(int i = 0; i < arrNhanVien.size(); i++) {
            if(arrNhanVien.get(i).tinhLuong() > max) {
                max = arrNhanVien.get(i).tinhLuong();
                pos = i;
            }
        }
    }

    public void hienThiNhanVienLuongCaoNhat() {
        checkPos();
        System.out.println("+ TOP 1 CAY CUOC XIN CHUC MUNG ! ");
        System.out.println("- maNV: " + arrNhanVien.get(pos).getMaNV());
        System.out.println("- hoTen: " + arrNhanVien.get(pos).getHoTen());
        System.out.println("- luongCB: " + arrNhanVien.get(pos).getLuongCB());
        System.out.println("- hsLuong: " + arrNhanVien.get(pos).getHsLuong());
        System.out.println("- Luong: " + arrNhanVien.get(pos).tinhLuong());
    }
}