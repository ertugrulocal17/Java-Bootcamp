package Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Start entering numbers: ");
        int sum = 0;
        int num;

        while ((num = Integer.parseInt(scanner.nextLine())) != 0){
            sum+=num;
            System.out.printf("Sum: %d%n",sum);
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Start entering numbers: ");

        int positiveSum = 0;
        int negativeSum = 0;
        int num;
        while ((num = Integer.parseInt(scanner.nextLine())) != 0) {
            if (num > 0) {
                positiveSum += num;
            } else {
                negativeSum += num;
            }
            displayResult(positiveSum, negativeSum);
        }

    }

    public static void displayResult(int positiveSum, int negativeSum) {
        if (positiveSum > 0) {
            System.out.printf("Sum of positive numbers: %d%n", positiveSum);
        } else {
            System.out.println("You didn't enter any numbers");
        }

        if (negativeSum < 0) {
            System.out.printf("Sum of negative numbers: %d%n", negativeSum);
        } else {
            System.out.println("You didn't enter any numbers");
        } */



        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num;

        while ((num = scanner.nextInt()) != 0) {
            int countOfDigit = getDigitsCount(num);
            System.out.printf("The number of digits: %d is: %d%n", num, countOfDigit);
            System.out.print("Enter a number: ");
        }
        System.out.println("The number of digit 0 is: 1");*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num;
        while ((num = scanner.nextInt()) != 0){
            int sumOfNumbersDigits = getDigitsSum(num);
            System.out.printf("The sum of the digits of %d is : %d%n",num,sumOfNumbersDigits);
            System.out.print("Enter a number: ");
        }*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num;
        while ((num = scanner.nextInt()) != 0){
            int reverse = getReverse(num);
            System.out.printf("The reverse of %d is %d%n",num,reverse);
            System.out.print("Enter a number: ");
        }*/


        Scanner scanner = new Scanner(System.in);
        for (;;){
            System.out.print("Enter the base number: ");
            int baseNumber = scanner.nextInt();

            System.out.print("Enter the power of number: ");
            int powerOfNumber = scanner.nextInt();

            System.out.printf("pow(%d,%d) = %d%n",baseNumber,powerOfNumber,pow(baseNumber,powerOfNumber));
        }

    }

    public static int pow(int number,int power){
        if (number <= 0){
            return 1;
        }
        int result = 1;
        for (int i = 0; i < power; i++){
            result *= number;
        }
        return result;
    }

    /*public static int getReverse(int num){
        int reverse = 0;
        while (num != 0){
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        return reverse;
    }*/

    /*public static int getDigitsCount(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num != 0) {
            ++count;
            num /= 10;
        }
        return count;
    }*/

    /*public static int getDigitsSum(int num){
        int sum = 0;
        while (num !=0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }*/


}
