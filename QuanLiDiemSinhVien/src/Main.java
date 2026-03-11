public class Main {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.nhapN();
        sinhVien.nhapDiem();
        sinhVien.tinhToan();
        sinhVien.sapxep();
        System.out.println("DIEM TRUNG BINH: " + sinhVien.getDiemTB());
        System.out.println("MIN: " + sinhVien.getMin());
        System.out.println("MAX: " + sinhVien.getMax());
        System.out.print("SAP XEP: ");
        for(int i = 0; i < sinhVien.getN(); i++) {
            System.out.print(sinhVien.insort(i) + " ");
        }
    }
}