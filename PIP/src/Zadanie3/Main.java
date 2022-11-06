package Zadanie3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x");
        int x = scanner.nextInt();
        System.out.println("Podaj y");
        int y = scanner.nextInt();
        int z = x;
        x = y;
        y = z;
        System.out.println("nowa liczba x to " + x + " nowa liczba y to " + y);
    }
}