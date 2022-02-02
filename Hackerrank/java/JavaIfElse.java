package Hackerrank.java;

import java.util.*;


public class JavaIfElse {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n <= 5 && n >= 2) {
                System.out.println("Not Weird");
            }
            if (n <= 20 && n >= 6) {
                System.out.println("Weird");

            }
            if (n > 20) {
                System.out.println("Not Weird");
            }
        }


        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}