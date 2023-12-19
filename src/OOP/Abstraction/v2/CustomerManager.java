package OOP.Abstraction.v2;

public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager;
    public void getCustomers(){
        baseDatabaseManager.getData();
    }
}
