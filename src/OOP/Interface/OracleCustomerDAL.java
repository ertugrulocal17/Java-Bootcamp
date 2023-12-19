package OOP.Interface;

public class OracleCustomerDAL implements ICustomerDAL{
    @Override
    public void add(){
        System.out.println("Added to Oracle");
    }
}
