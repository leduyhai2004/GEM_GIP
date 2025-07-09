package section1_5;

import java.io.*;
import java.util.Scanner;

public class DemoBasic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("Nhập b: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.print("Nhập c: ");
        int c = Integer.parseInt(reader.readLine());

        int max = Math.max(a, Math.max(b, c));
        System.out.println("Số lớn nhất là: " + max);
    }
}
