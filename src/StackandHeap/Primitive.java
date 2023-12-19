package StackandHeap;

import java.util.Arrays;

public class Primitive {
    int userId;
    boolean isActive;
    double userNote;
    long categoryId;

    public static void main(String[] args) {
        Primitive primitive = new Primitive();
        System.out.println(primitive.userId);
        System.out.println(primitive.isActive);
        System.out.println(primitive.userNote);
        System.out.println(primitive.categoryId);

        /*int total = 5;
        double price = 0;
        boolean isActive = true;
        long a = 1;*/

        int price = 0;
        System.out.println("Price: " + price);
        int total = price;
        System.out.println("Total: " + total);
        price = Integer.MAX_VALUE;

        System.out.println("Price" + price);
        System.out.println("Total" + total);

        int number = 99;
        System.out.println(number);
        changeNumber(number);
        System.out.println(number);

        long[] values = {0,0,0};
        System.out.println(Arrays.toString(values));
        changeReference(values);
        System.out.println(Arrays.toString(values));
    }
    static void changeNumber(int number){
        number = 100;
    };
    static void changeReference(long[] values){
        values = new long[3]; // values are not changed if you want to change the values you need to use values[0] = 100;
        values[0] = 100;
        values[1] = 200;
        values[2] = 300;
    }
}
