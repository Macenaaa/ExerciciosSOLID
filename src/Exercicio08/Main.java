package Exercicio08;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueryEngine engine = new LuceneSearchEngine();
        AutocompleteService service = new AutocompleteService(engine);

        List<String> suggestions = service.suggest("he");
        System.out.println("Sugestões: " + suggestions);
    }
}
