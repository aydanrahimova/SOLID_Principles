package D_DependencyInversion.badExample;

public class DataProcessor {
    private MySQLDatabase database = new MySQLDatabase();

    public void process(String data) {
        database.save(data);
    }
}
