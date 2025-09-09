package Exercicio10;

public class ConsoleSink implements LogSink {
    @Override
    public void write(String msg) {
        System.out.println(msg);
    }
}

