package Exercicio06;

import java.util.List;

class ReportService {
    private final List<ReportRenderer> renderers;

    public ReportService(List<ReportRenderer> renderers) {
        this.renderers = renderers;
    }

    public byte[] generate(String format, ReportData data) {
        return renderers.stream()
                .filter(r -> r.getFormat().equalsIgnoreCase(format))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown format: " + format))
                .render(data);
    }
}
