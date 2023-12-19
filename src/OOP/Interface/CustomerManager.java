package OOP.Interface;

public class CustomerManager {
    private ICustomerDAL customerDAL;

    public CustomerManager(ICustomerDAL customerDAL){
        this.customerDAL = customerDAL;
    }
    public void add(){
        // business layer
        customerDAL.add();
    }

    public ICustomerDAL getCustomerDAL() {
        return customerDAL;
    }

    public void setCustomerDAL(ICustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }
}
