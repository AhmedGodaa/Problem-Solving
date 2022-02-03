package Hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class javaLoop {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(input + " x " + i + " = " + input * i);
        }

    }
}
