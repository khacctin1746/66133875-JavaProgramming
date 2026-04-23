package thigk2.nguyenkhactin;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Tạo ra danh sách để lưu các số nguyên đọc từ file
        ArrayList<Integer> list = new ArrayList<>();

        // khai báo mã số sinh viên
        String mssv = "66133875";
        // Lấy kí tự cuối của mã số sinh viên chuyển sang số nguyên
        int x = Character.getNumericValue(mssv.charAt(mssv.length() - 1));

        try {
            // mở file data.txt để đọc
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            // đọc từng dòng
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                list.add(num);
            }
            // đóng file
            br.close();

        } catch (Exception e) {
            System.out.println("Lỗi đọc file!");
            return;
        }

        // In danh sách các số
        System.out.println("Danh sách số:");
        for (int n : list) {
            System.out.print(n + " ");
        }

        // Kiểm tra X có trong list không
        System.out.println("\n\nGiá trị X = " + x);

        if (list.contains(x)) {
            System.out.println("X có tồn tại trong danh sách");
        } else {
            System.out.println("X KHÔNG tồn tại trong danh sách");
        }
    }
}