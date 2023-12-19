package Memory;

public class Suv {
    int carKm;
    String name;
    static String carType = "SUV";
    static void print(){
        carType = "";
    }
    static void printf(String name){
        System.out.println(name);
    }
    public void prints(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
//        Suv suv = new Suv();
//        System.out.println(suv.carType);
//        System.out.println(Suv.carType);
//        System.out.println(carType);
        Suv suv = new Suv();
        suv.prints("A");
        Suv.printf("John");
        printf("Doe");
    }
}
