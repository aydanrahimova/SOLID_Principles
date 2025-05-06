package D_DependencyInversion.goodExample;

public class DataProcessor {
    private final Database database;

    public DataProcessor(Database database) {
        this.database = database;
    }

    public void process(String data) {
        database.save(data);
    }
}