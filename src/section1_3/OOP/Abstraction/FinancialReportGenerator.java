package section1_3.OOP.Abstraction;

// Lớp con dành cho báo cáo tài chính
public class FinancialReportGenerator extends ReportGenerator {
    @Override
    protected void fetchData() {
        System.out.println("Fetching financial data from ERP system...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing balance sheets and income statements...");
    }

    @Override
    protected void exportReport() {
        System.out.println("Exporting financial report to /reports/finance.pdf");
    }
}

