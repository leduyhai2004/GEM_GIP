package section1_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        //try-with-resources
        // Tự động đóng reader sau khi kết thúc
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.err.println("Lỗi đọc file: " + e.getMessage());
        }

        //nested try-catch
        try {
            // Mở file
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            try {
                String line;
                while ((line = reader.readLine()) != null)
                    System.out.println(line);
            } catch (IOException e) {
                System.err.println("Lỗi đọc file: " + e.getMessage());
            } finally {
                // Đóng file
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Lỗi đóng file: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Lỗi mở file: " + e.getMessage());
        }


        //Checked Exception
        try {
            FileReader fr = new FileReader("abc.txt"); // Checked Exception
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file.");
        }


        //Unchecked Exception
        try {
            String name = null;
            System.out.println(name.length()); // lỗi NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Đối tượng bị null.");
        }

    }
}
