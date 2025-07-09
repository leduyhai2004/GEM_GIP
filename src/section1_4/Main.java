package section1_4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Đơn luồng: chỉ chạy tuần tự
        for (int i = 0; i < 5; i++) {
            System.out.println("Task " + i + " đang chạy trên luồng chính");
        }

        // Đa luồng: tạo 5 luồng để chạy song song
        for (int i = 0; i < 5; i++) {
            final int id = i;
            new Thread(() -> {
                System.out.println("Task " + id + " đang chạy trên " + Thread.currentThread().getName());
            }).start();
        }

    }
}