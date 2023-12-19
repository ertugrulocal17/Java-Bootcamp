package OOP.Interface;

public class Main {
    public static void main(String[] args) {
//        ICustomerDAL customerDAL = new OracleCustomerDAL();
//        customerDAL.add();

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDAL());
//        customerManager.customerDAL = new MySQLCustomerDAL();
        customerManager.add();
    }
}
