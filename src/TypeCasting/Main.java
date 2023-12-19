package TypeCasting;

public class Main {
    public static void main(String[] args) {
        // Type Casting

        // 1. Primitive Casting
            // 1.1 Widening(no cast)
                // byte -> short -> char -> int -> long -> float -> double
        int i0 = 5;
        double d0 = i0;
        System.out.println(d0);

        char ch1 = 'A';
        int i2 = ch1;
        System.out.println(i2);
            // 1.2 Narrowing(necessary cast)
                // double -> float -> long -> int -> char -> short -> byte
        double d1 = 5.2;
        int i1 = (int)d1;
        System.out.println(i1);

        float f1 = 65f;
        char c3 = (char) f1;
        System.out.println(c3);

        float f2 = 10.65f;
        long l1 = (long) f2;
        System.out.println(l1);

        int fahrenheit = 100;
        int celcius = (int) ((fahrenheit - 32) * 5.0 / 9.0);
        System.out.println(celcius);


        short s1 = 128;
        byte b1 = (byte) s1;
        System.out.println(b1);
            // 1.3 Details
                // long-float and double
        long l2 = 123456789L;
        float f4 = l2;
        System.out.println(f4);
        // 2. String to Primitive && Primitive to String
    }

}
