package Exercicio10;
import java.io.FileWriter;
import java.io.IOException;

public class FileSink implements LogSink {
    private final String filename;

    public FileSink(String filename) {
        this.filename = filename;
    }

    @Override
    public void write(String msg) {
        try (var fw = new FileWriter(filename, true)) {
            fw.write(msg + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
