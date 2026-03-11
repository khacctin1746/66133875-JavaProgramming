import java.util.Scanner;

public class SinhVien {
    Scanner scanner = new Scanner(System.in);
    private int diem;
    private double diemTB;
    private int[] array = new int[10];
    private int n;
    int max;
    int min;

    //getter
    public int getN() {
        return this.n;
    }

    public double getDiemTB() {
        return this.diemTB;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    //setter
    public void setN(int n) {
        if(!(n <= 0)) {
            this.n = n;
        } else {
            System.out.println("N khong duoc nho hon 1");
        }
    }

    public boolean setDiem(int diem) {
        if(!(diem < 0 && diem > 10)) {
            return true;
        }
        return false;
    }

    public void nhapN() {
        System.out.print("Vui long nhap n: ");
        n = scanner.nextInt();
    }

    public void nhapDiem() {
        for(int i = 0; i < n; ++i) {
            System.out.print("Vui long nhap diem cua sinh vien thu " + (i+1) + ": ");
            diem = scanner.nextInt();
            if(setDiem(diem) == true) {
                array[i] = diem;
            } else {
                System.out.println("Diem phai >= 0 va <= 10");
                i--;
            }
        }
    }

    public void tinhToan() {
        int save = 0;
        int save1 = 0;
        int save2 = 10;
        for(int i = 0; i < n; ++i) {
            save += array[i];
            if(array[i] > save1) {
                save1 = array[i];
                max = array[i];
            } else if(array[i] < save2) {
                save2 = array[i];
                min = save2;
            }
        }
        this.diemTB = save/n;
    }

    public void sapxep() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(array[j] > array[i]) {
                    int save = array[i];
                    array[i] = array[j];
                    array[j] = save;
                }
            }
        }
    }

    public int insort(int i) {
        return array[i];
    }
}
