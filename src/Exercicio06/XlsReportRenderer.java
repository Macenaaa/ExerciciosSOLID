package Exercicio06;

class XlsReportRenderer implements ReportRenderer {
    @Override
    public byte[] render(ReportData data) {
        // Fake XLS
        String xls = "XLS Report: " + data.title + "\n" + String.join("\n", data.lines);
        return xls.getBytes();
    }

    @Override
    public String getFormat() {
        return "XLS";
    }
}
