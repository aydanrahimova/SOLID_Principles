package D_DependencyInversion.badExample;

public class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saved in MySQL: " + data);
    }
}


