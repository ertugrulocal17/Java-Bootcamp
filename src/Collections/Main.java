package Collections;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
//        ArrayList<Customer> customers = new ArrayList<>();
//        customers.add(new Customer(1,"John","Doe"));
//        customers.add(new Customer(2,"Jane","Doe"));
//        customers.add(new Customer(3,"John","Conor"));
//
//        for (Customer customer : customers){
//            System.out.println(customer.firstName + "\t" +  customer.lastName);
//        }


//        HashMap
        HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("book","kitap");
        dictionary.put("table","masa");
        dictionary.put("computer","bilgisayar");
        dictionary.remove("table");
        System.out.println(dictionary);
        System.out.println(dictionary.get("table"));
    }
}
