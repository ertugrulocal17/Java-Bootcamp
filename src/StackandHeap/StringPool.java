package StackandHeap;

public class StringPool {


    public static void main(String[] args) {
        String productName = "HP";
        String productName2 = "HP";
        String prodductName3 = productName;
        String value = new String("HP");
        System.out.println(productName == value); // false
        System.out.println(productName == productName2); // true
    }
}
