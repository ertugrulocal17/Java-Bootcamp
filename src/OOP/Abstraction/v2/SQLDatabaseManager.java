package OOP.Abstraction.v2;

public class SQLDatabaseManager extends  BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Fetching data... (MySQL)");
    }
}
