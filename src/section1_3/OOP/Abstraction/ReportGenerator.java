package section1_3.OOP.Abstraction;

public abstract class ReportGenerator {
    // Template method: tổng hợp các bước
    public final void generateReport() {
        fetchData();
        processData();
        formatReport();
        exportReport();
    }

    protected abstract void fetchData();      // lớp con cung cấp dữ liệu
    protected abstract void processData();    // lớp con xử lý dữ liệu

    // Triển khai chung
    private void formatReport() {
        System.out.println("Formatting report to PDF layout...");
    }

    // Có thể override nếu cần
    protected void exportReport() {
        System.out.println("Exporting report to default location...");
    }
}
