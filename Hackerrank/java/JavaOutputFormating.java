package Hackerrank.java;

import java.util.Scanner;
import java.util.ArrayList;

public class JavaOutputFormating {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        for (int i = 0; i < 3; i++) {
            String string = scanner.next();
            int integer = scanner.nextInt();
            lines.add(string);
            numbers.add(integer);
        }
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.println(lines.get(i));
        }


        System.out.println("================================");

    }
}
