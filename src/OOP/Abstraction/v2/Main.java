package OOP.Abstraction.v2;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new SQLDatabaseManager();
        customerManager.getCustomers();
    }
}
