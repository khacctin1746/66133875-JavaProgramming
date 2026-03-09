import java.util.Scanner;
import java.util.Random;

public class DoanSo {
    private int[] num;
    private int randomNum;
    private int diem;

    //default constructor
    public DoanSo() {
        num = new int[10];
    }
    public void setNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+ Hệ Thống Đoán Số Cây Nhà Lá Cành");
        for(int i = 0; i < 10; ++i) {
            System.out.print("- Vui lòng nhập số thứ " + i + " (0 - 100) : ");
            int n = scanner.nextInt();
            if(n < 0 || n > 100) {
                System.out.println("> Số bạn nhập không hợp lệ vui lòng nhập lại!");
                i--;
            } else {
                setRandomNum();
                num[i] = n;
                checkResult(num[i]);
                tinhDiem(num[i],randomNum);
            }
        }
        System.out.println("+ Tổng điểm của bạn là: " + getDiem());
        choiLai();
    }

    public void setRandomNum() {
        Random rd = new Random();
        this.randomNum = rd.nextInt(101);
    }

    public void checkResult(int num1) {
        if(this.randomNum == num1) {
            System.out.println("> Bằng nhau | Số ngẫu nhiên: " + randomNum);
        } else if(num1 > this.randomNum) {
            System.out.println("> Lớn hơn | Số ngẫu nhiên: " + randomNum);
        } else System.out.println("> Nhỏ hơn | Số ngẫu nhiên: " + randomNum);
    }

    public void tinhDiem(int num, int randomNum) {
        if(!(randomNum != num)) {
            this.diem++;
            System.out.println("+ Bạn được cộng một điểm! Tổng hiện tại" + getDiem());
        }
    }

    public int getDiem() {
        return diem;
    }
    public void choiLai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("+ Bạn có muốn chơi lại? (Y/N): ");
        String input = scanner.nextLine();
        if(input.equals("Y")) {
            setNum();
        } else {
            System.out.println("- See you again :D");
        }
    }
}
