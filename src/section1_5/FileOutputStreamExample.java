package section1_5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("src/section1_5/Microservices.png");
                FileOutputStream fos = new FileOutputStream("src/section1_5/copy.jpg")
        ) {
            byte[] buffer = new byte[1024]; // đọc theo block 1KB
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Copy thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

