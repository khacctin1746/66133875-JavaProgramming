package packHS;

import java.util.ArrayList;
import java.util.Scanner;

public class HocSinh {
    private String tenHS, lopHS;
    private short tuoiHS;

    ArrayList<HocSinh> ds;
    Scanner scanner = new Scanner(System.in);

    public HocSinh() {
        this.tenHS = "";
        this.lopHS = "";
        this.tuoiHS = 0;
        ds = new ArrayList<>();
    }
    public HocSinh(String tenHS, String lopHS, short tuoiHS) {
        this.tenHS = tenHS;
        this.lopHS = lopHS;
        this.tuoiHS = tuoiHS;
        ds = new ArrayList<>();
    }

    public String getTenHS() {
        return this.tenHS;
    }

    public String getLopHS() {
        return this.lopHS;
    }

    public short getTuoiHS() {
        return this.tuoiHS;
    }

    public void setTenHS(String tenHS) {
        if(!(tenHS.trim().isEmpty())) {
            this.tenHS = tenHS;
        }
    }

    public void setLopHS(String lopHS) {
        if(!(lopHS.trim().isEmpty())) {
            this.lopHS = lopHS;
        }
    }

    public void setTuoiHS(short tuoiHS) {
        if(!(tuoiHS <= 0)) {
            this.tuoiHS = tuoiHS;
        }
    }

    public String toString() {
        return "HocSinh = [ TenHS: " + tenHS + ", TuoiHS: " + tuoiHS + ", lopHS: " + lopHS + "]";
    }

    public void nhap(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("NHAP THONG TIN HOC SINH " + (i+1));
            System.out.print("Vui long nhap ten: ");
            String ten = scanner.nextLine();
            System.out.print("Vui long nhap tuoi: ");
            short tuoi = scanner.nextShort();
            scanner.nextLine();
            System.out.print("Vui long nhap lop: ");
            String lop = scanner.nextLine();
            ds.add(new HocSinh(ten,lop,tuoi));
        }
    }

    public void xuat() {
        for(int i = 0; i < ds.size(); i++) {
            System.out.println("XUAT THONG TIN HOC SINH " + (i + 1));
            System.out.println("Ten hoc sinh: " + ds.get(i).getTenHS());
            System.out.println("Tuoi hoc sinh: " + ds.get(i).getTuoiHS());
            System.out.println("Lop hoc sinh: " + ds.get(i).getLopHS());
        }
    }

    public void themHS(int n) {
        System.out.println("THEM HOC SINH THU " + (n));
        System.out.print("Vui long nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Vui long nhap tuoi: ");
        short tuoi = scanner.nextShort();
        scanner.nextLine();
        System.out.print("Vui long nhap lop: ");
        String lop = scanner.nextLine();
        ds.add(new HocSinh(ten,lop,tuoi));
    }

    public void xuatLai() {
        for(int i = 0; i < ds.size(); i++) {
            System.out.println("XUAT THONG TIN HOC SINH SAU KHI THEM " + (i + 1));
            System.out.println("Ten hoc sinh: " + ds.get(i).getTenHS());
            System.out.println("Tuoi hoc sinh: " + ds.get(i).getTuoiHS());
            System.out.println("Lop hoc sinh: " + ds.get(i).getLopHS());
        }
    }

    public void xoaHS(String tenHS) {
        for(int i = 0; i < ds.size(); i++) {
            if(ds.get(i).getTenHS().equals(tenHS)) {
                System.out.println("Tim thay hoc sinh ten " + tenHS + "tai vi tri: " + i);
                ds.remove(i);
                break;
            }
        }
    }

    public void xoaXuatLai() {
        for(int i = 0; i < ds.size(); i++) {
            System.out.println("XUAT THONG TIN HOC SINH SAU KHI XOA" + (i + 1));
            System.out.println("Ten hoc sinh: " + ds.get(i).getTenHS());
            System.out.println("Tuoi hoc sinh: " + ds.get(i).getTuoiHS());
            System.out.println("Lop hoc sinh: " + ds.get(i).getLopHS());
        }
    }
}
