import packHS.HocSinh;

public class Main {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh();
        hocSinh.nhap(2);
        hocSinh.xuat();
        hocSinh.themHS(3);
        hocSinh.xuatLai();
        hocSinh.xoaHS("Hoa");
        hocSinh.xoaXuatLai();
    }
}