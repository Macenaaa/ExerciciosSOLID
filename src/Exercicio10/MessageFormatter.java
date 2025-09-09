package Exercicio10;


import java.time.Instant;

public class MessageFormatter {
    public String format(String msg) {
        return Instant.now() + " - " + msg;
    }
}
