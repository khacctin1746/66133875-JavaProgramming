import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int muc;
    public static String maSachMuon;
    public static String maSachTra;
    public static ArrayList<ThuVien> thuVien = new ArrayList<>();

    public static void main(String[] args) {

        //ArrayList<ThuVien> thuVien = new ArrayList<>(); Cai nay dua ra ngoai main de dung duoc cho checkMuc;

        // sach 1:
        ThuVien sach1 = new ThuVien();

        sach1.setMaSach("FER174");
        sach1.setTenSach("Nhat Ki Cay Me");
        sach1.setTacGia("Alesander Ponikov");
        sach1.setNamXuatBan(2006);
        sach1.setTrangThai(false);
        thuVien.add(sach1);

        //sach 2
        ThuVien sach2 = new ThuVien();

        sach2.setMaSach("FER175");
        sach2.setTenSach("Nhat Ki Cay Khe");
        sach2.setTacGia("Miase Poniket");
        sach2.setNamXuatBan(1999);
        sach2.setTrangThai(true);
        thuVien.add(sach2);

        //sach 3
        ThuVien sach3 = new ThuVien();

        sach3.setMaSach("FER176");
        sach3.setTenSach("Nhat Ki Cay Ot");
        sach3.setTacGia("Eimi Fukuma");
        sach3.setNamXuatBan(2026);
        sach3.setTrangThai(true);
        thuVien.add(sach3);

        tuyChon();
        checkMuc();

    }
    public static void tuyChon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thu Vien Cay Nha La Canh");
        System.out.println("");
        System.out.println(" Ban muon lam gi?");
        System.out.println(" 1. Toi muon muon sach");
        System.out.println(" 2. Toi muon tra sach");
        System.out.println(" 3. Toi muon kiem tra sach cu");
        System.out.print("Vui long chon muc (1 - 3): ");
        muc = scanner.nextInt();
    }

    public static void checkMuc() {
        Scanner scanner = new Scanner(System.in);
        if(muc == 1) {
            System.out.println("Vui long chon sach hien co: ");
            for(int i = 0; i < thuVien.size(); i++) {
                System.out.println(i + ". Ten sach: " + thuVien.get(i).getTenSach() + " | Ma sach: " + thuVien.get(i).getMaSach()  + " | Tac gia: " + thuVien.get(i).getTacGia() + " | Nam XB: " + thuVien.get(i).getNamXuatBan() + " | Trạng thái: " + thuVien.get(i).getTrangThaiString());
            }
            System.out.print("Vui long dien ma sach: ");
            maSachMuon = scanner.nextLine();
            updateStatusMuon(maSachMuon);
        } else if(muc == 2) {
            System.out.print("Vui long dien ma sach ban muon tra: ");
            maSachTra = scanner.nextLine();
            updateStatusTra(maSachTra);
        } else if(muc == 3) {
            System.out.println("Duoi day day la list sach cu:");
            for(int i = 0; i < thuVien.size(); i++) {
                if(thuVien.get(i).kiemTraSachCu() == true) {
                    System.out.println(i + ". Ten sach: " + thuVien.get(i).getTenSach() + " | Ma sach: " + thuVien.get(i).getMaSach()  + " | Tac gia: " + thuVien.get(i).getTacGia() + " | Nam XB: " + thuVien.get(i).getNamXuatBan());
                }
            }
        }
    }

    public static void updateStatusTra(String maSachTra) {
        int save = 0;
        for(int i = 0; i < thuVien.size(); i++) {
            if(thuVien.get(i).getMaSach().equals(maSachTra)) {
                thuVien.get(i).traSach();
                save = 1;
                //Debug status
                //System.out.println(thuVien.get(i).getMaSach() + " " + thuVien.get(i).getTrangThai());
                break;
            }
        }
        if(save == 0) {
            System.out.println("Ma sach ban nhap khong ton tai trong he thong");
        }
    }

    public static void updateStatusMuon(String maSachMuon) {
        int save = 0;
        for(int i = 0; i < thuVien.size(); i++) {
            if(thuVien.get(i).getMaSach().equals(maSachMuon)) {
                if(thuVien.get(i).getTrangThai() == true) {
                    thuVien.get(i).setTrangThai(false);
                    //debug status
                    //System.out.println(thuVien.get(i).getMaSach() + " " + thuVien.get(i).getTrangThai());
                    System.out.println("Ban da muon thanh cong: " + thuVien.get(i).getMaSach() + " | Ten: " + thuVien.get(i).getTenSach() + " | Tac gia: " + thuVien.get(i).getTacGia() + " | Nam XB: " + thuVien.get(i).getNamXuatBan());
                } else {
                    System.out.println("Sach da co nguoi muon, vui long quay lai sau");
                }
                save = 1;
            }
            if(save == 0) {
                System.out.println("Ma sach ban nhap khong ton tai trong he thong");
            }
        }
    }
}