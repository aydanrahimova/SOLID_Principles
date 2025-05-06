package D_DependencyInversion.goodExample;

public class MySQLDatabase implements Database {
    public void save(String data) {
        System.out.println("Saved in MySQL: " + data);
    }
}