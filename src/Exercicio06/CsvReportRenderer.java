package Exercicio06;

    class CsvReportRenderer implements ReportRenderer {
        @Override
        public byte[] render(ReportData data) {
            String csv = String.join("\n", data.lines);
            return csv.getBytes();
        }

    
        @Override
        public String getFormat() {
            return "CSV";
        }
    }

