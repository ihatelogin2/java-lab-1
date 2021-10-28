package Zadania;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj stringa: ");
        String s =scanner.nextLine();
        System.out.println("podaj inta: ");
        int i = scanner.nextInt();

        System.out.println("twoj tekst to:" + s + " a liczba zwiekszona o 1 to: "+ (i+1));



    }
}
