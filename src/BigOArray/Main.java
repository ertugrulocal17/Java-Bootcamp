package BigOArray;

import java.util.Arrays;

public class Main {
    public static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] twoSum(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("Not Valid");
    }

    void foo(int[] array) {
        int sum = 0; // --> 1
        int product = 1; // --> 1
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // --> 1
        } // for loop --> n
        for (int i = 0; i < array.length; i++) {
            product *= array[i]; // --> 1
        } // for loop --> n
        System.out.println(sum + ", " + product); // --> 1
    } // O(n)

    void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) { // --> n
            for (int j = 0; j < array.length; j++) { // --> n
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    } // --> O(n^2)

    void printUnorderedPairs(int[] array) { // --> n
        for (int i = 0; i < array.length; i++) { // --> n
            for (int j = i + 1; j < array.length; j++)
                System.out.println(array[i] + ", " + array[j]); // --> 1
        } // (n-1)((n+1) - 1) / 2 --> n^2
    } // --> O(n^2)

    public static void main(String[] args) {
        // Declaration
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        // region boiler print
        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Elements at index " + i + ": " + anArray[i]);
        }

        // region shortcut
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : array) {
            System.out.println(i);
        }

        // declaring and initializing 2D array
        int arr[][] = {
                {1, 2, 3},
                {2, 4, 5},
                {4, 4, 5},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        ;
        int[] myArr = {1, 2, 3, 4, 5, 6};

        System.out.println(findIndex(myArr, 3));

        System.out.println(Arrays.toString(twoSum(myArr, 4)));
    }


}
