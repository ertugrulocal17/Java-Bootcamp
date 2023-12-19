package StackandHeap;

import java.util.Arrays;

public class Reference {

    String message;
    int[] notes;
    boolean[] active;
    String[] names;

    public static void main(String[] args) {
        Reference reference = new Reference();
        System.out.println(reference.message);
        System.out.println(Arrays.toString(reference.notes));
        System.out.println(Arrays.toString(reference.active));
        System.out.println(Arrays.toString(reference.names));

        int[] schoolNotes = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(schoolNotes));
        int[] highSchoolNotes = schoolNotes;
        System.out.println(Arrays.toString(highSchoolNotes));
        schoolNotes[0] = 0;
        System.out.println(Arrays.toString(schoolNotes));
        System.out.println(Arrays.toString(highSchoolNotes));


        int a = 5;
        int b = 5;
        System.out.println(a == b); // true

        String productName = new String("Milk");
        String productName2 = new String("Milk");
        System.out.println(productName == productName2); // false
        System.out.println(productName.equals(productName2)); // true

        String blackFriday = "Friday";
        blackFriday = "Thursday";
        System.out.println(blackFriday);
    }
}
