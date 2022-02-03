package Hackerrank.java;

import java.util.Scanner;


public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String string = scanner.next();
            int integer = scanner.nextInt();
            System.out.printf("%-15s%03d\n", string, integer);
        }
        System.out.println("================================");
    }

}
