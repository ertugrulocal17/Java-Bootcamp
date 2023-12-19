package Enum;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Color c = Color.BLUE;
        System.out.println(c.ordinal());
        DayOfWeek dayOfWeek = DayOfWeek.MON;
        System.out.println(dayOfWeek.ordinal());
        System.out.println(dayOfWeek.valueOf("TUE"));
    }
}

enum Color {
    RED,GREEN,BLUE;
}
enum DayOfWeek{
    SUN,MON,TUE,WED,THU,FRI,SAT;
}

