package BasicOperators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
    }

    static int sum (int... a){
        int s = 0;
        for (int i =0; i<a.length;i++) s += a[i];
        return s;
    }
}
