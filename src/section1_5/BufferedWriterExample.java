package section1_5;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/section1_5/output.txt"))) {
            writer.write("Dòng 1: Xin chào Java");
            writer.newLine();
            writer.write("Dòng 2: Đây là BufferedWriter");
            writer.newLine();
            writer.write("Dòng 3: Ghi thành công! update");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

