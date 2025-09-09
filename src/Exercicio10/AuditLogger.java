package Exercicio10;

public class AuditLogger {
    private final List<LogSink> sinks;
    private final MessageFormatter formatter;

    public AuditLogger(List<LogSink> sinks, MessageFormatter formatter) {
        this.sinks = sinks;
        this.formatter = formatter;
    }

    public void log(String msg) {
        String formatted = formatter.format(msg);
        for (LogSink sink : sinks) {
            sink.write(formatted);
        }
    }
}