package OOP.Polymorphism;

public class CustomerManager{
    private BaseLogger baseLogger;
    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger = baseLogger;
    }
    public void add(){
        System.out.println("The customer added successfully");
        this.baseLogger.log("Log message");
    }
}
