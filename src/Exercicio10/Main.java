package Exercicio10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MessageFormatter formatter = new MessageFormatter();
        AuditLogger logger = new AuditLogger(
            List.of(new ConsoleSink(), new FileSink("audit.log")),
            formatter
        );

        logger.log("Usuário logou no sistema");
        logger.log("Alteração de senha realizada");
    }
}
 
