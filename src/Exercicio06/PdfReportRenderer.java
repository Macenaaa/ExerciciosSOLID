package Exercicio06;

class PdfReportRenderer implements ReportRenderer {
    @Override
    public byte[] render(ReportData data) {
        String fakePdf = "PDF Report: " + data.title + "\n" + String.join("\n", data.lines);
        return fakePdf.getBytes();
    }

    @Override
    public String getFormat() {
        return "PDF";
    }
}

