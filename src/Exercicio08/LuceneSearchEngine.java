package Exercicio08;

class LuceneSearchEngine implements QueryEngine, Indexer, MaintenanceOps {
    @Override
    public List<String> query(String q) {
        return Arrays.asList("foo", "bar", "baz"); 
    }

    @Override
    public List<String> index(String path) {
        return Arrays.asList("indexed: " + path);
    }

    @Override
    public void warmupCache() {
        System.out.println("Cache warmed up.");
    }

    @Override
    public void rebuildAll() {
        System.out.println("Index rebuilt.");
    }
}
