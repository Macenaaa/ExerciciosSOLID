package Exercicio08;

import java.util.List;

public class AutocompleteService {
    private final QueryEngine engine;

    public AutocompleteService(QueryEngine engine) {
        this.engine = engine;
    }

    public List<String> suggest(String prefix) {
        return engine.query(prefix + "*");
    }
}
