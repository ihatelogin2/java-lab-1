package Zadania;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe: ");
        int i = scanner.nextInt();
        System.out.println("podaj druga lcizbe: ");
        int j = scanner.nextInt();

        if (i > j) {
            System.out.println("wieksza jest liczba i.");
        } else {
            System.out.println("wieksz jest j.");
        }

        if (i > 100) {
            System.out.println("pierwsza liczba jest wieksza od 100.");
        } else if (i < 20) {
            System.out.println("1sza liczba jest mniejsza od 20");
        } else if (i == 50) {
            System.out.println("1sza liczba to 50.");
        } else {
            System.out.println("pierwsza liczba jest mniejsza od 100, wieksza od 20 i nie jest to 50.");
        }
    }
}
