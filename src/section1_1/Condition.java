package section1_1;

import java.util.Scanner;

public class Condition {
    //write all condition type for me
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // if condition
        if (a < b) {
            System.out.println("a is less than b");
        }

        // if-else condition
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is not greater than b");
        }

        // switch case condition
        switch (a) {
            case 10:
                System.out.println("a is equal to 10");
                break;
            case 20:
                System.out.println("a is equal to 20");
                break;
            default:
                System.out.println("a is neither 10 nor 20");
                break;
        }
        Scanner sc = new Scanner(System.in);
        // nested if condition


    }
}
