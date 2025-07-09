package section1_5;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/section1_5/Microservices.png")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                // Có thể xử lý byte tại đây nếu cần
                System.out.print(byteData + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}