package Zadania;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {

        //a)     *******************
        int mojWiek = 21;

        if (mojWiek%3==0){
            System.out.println("Moj wiek jest podzielny przez 3.");
        }else{
            System.out.println("moj wiek jest niepodzielny przez 3.");
        }
        //b))   ********************
        int nrIndexu = 53391;


       int wynik = (nrIndexu%2==0)? 0 : 1;
        System.out.println("wynik= " + wynik);


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe z przecinkiem");
        double d = scanner.nextDouble();
        if (d>100.5){
            System.out.println("zmienna d jest wieksza od 100,5.");
        }else if (d<20.5){
            System.out.println("zmienna d jest mniejsza od 20,5.");
        }else if (d==50.5){
            System.out.println("zmienna d jest równq 50,5.");
        }else{
            System.out.println("zmienna d jest mniejsza od 100,5, wieksza od 20,5, i nie wynosi 50,5.");
        }
    }
}
