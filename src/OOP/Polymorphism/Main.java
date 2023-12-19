package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger()};
//        for (BaseLogger baseLogger : loggers){
//            baseLogger.log("Log message");
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
