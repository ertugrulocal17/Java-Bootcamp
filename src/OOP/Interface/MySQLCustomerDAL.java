package OOP.Interface;

public class MySQLCustomerDAL implements ICustomerDAL{

    @Override
    public void add() {
        System.out.println("Added to MySQL");
    }
}
