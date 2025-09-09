package Exercicio06;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        ReportService service = new ReportService(List.of(
                new PdfReportRenderer(),
                new CsvReportRenderer(),
                new XlsReportRenderer()
        ));

        ReportData data = new ReportData(null);
        data.title = "Vendas";
        data.lines.add("Produto A, 100");
        data.lines.add("Produto B, 200");

        System.out.println(new String(service.generate("CSV", data)));
        System.out.println(new String(service.generate("PDF", data)));
        System.out.println(new String(service.generate("XLS", data)));
    }
}
