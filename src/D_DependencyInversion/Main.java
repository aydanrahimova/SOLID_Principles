package D_DependencyInversion;

import D_DependencyInversion.goodExample.DataProcessor;
import D_DependencyInversion.goodExample.Database;
import D_DependencyInversion.goodExample.MySQLDatabase;

public class Main {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        DataProcessor processor = new DataProcessor(db);
        processor.process("Important Data");
    }
}
