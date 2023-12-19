package OOP.Abstraction.v2;

public class OracleDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Fetching data... (Oracle)");
    }
}
