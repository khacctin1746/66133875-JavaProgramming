import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("D:\\testUnicode.txt");
        BufferedReader br = new BufferedReader(fr);

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        br.close();
    }
}