package section1_5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/section1_5/data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Dòng: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
