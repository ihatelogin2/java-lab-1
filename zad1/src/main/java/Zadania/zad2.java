package Zadania;

public class zad2 {
    public static void main(String[] args) {
        //zad1     **************************
        int i = 2;
        int i1 = 76;
        String s = "s";
        long l = 1000000;
        short sh=1;
        byte b = 1;
        boolean bool = true;
        double d = 1.5;
        float f = 0.25f;
        char c = 'c';
        System.out.println("int i ="+i);
        System.out.println("String s ="+s);
        System.out.println("long l="+l);
        System.out.println("short sh="+sh);
        System.out.println("byte b="+b);
        System.out.println("boolean bool="+bool);
        System.out.println("double d="+d);
        System.out.println("float f="+f);
        System.out.println("char c="+c);

        //zad2     *******************************
        //a)       *******************************

        int liczbaA = 2;
        int liczbaB = 76;
        double liczbaX = 2.5;
        double liczbaY = 1.5;
        int wynik;
        int wynik1;
        int wynik2;
        int wynik3;
        int wynik4;
        double sum;
        double sum1;
        double sum2;
        double sum3;
        double sum4;
       wynik= liczbaA+liczbaB;
        System.out.println("wynik dodawania= "+wynik);

        wynik1=liczbaB-liczbaA;
        System.out.println("wynik odejmowania= "+wynik1);

        wynik2=liczbaB*liczbaA;
        System.out.println("wynik mnozenia= "+wynik2);

        wynik3=liczbaB%liczbaA;
        System.out.println("modulo= "+wynik3);

        wynik4=liczbaB/liczbaA;
        System.out.println("wynik dzielenia= "+wynik4);

        //b)         **************


        sum=liczbaX+liczbaY;
        System.out.println("wynik dodwania= "+sum);

        sum1=liczbaX-liczbaY;
        System.out.println("wynik dodawania= "+sum1);

        sum2=liczbaX*liczbaY;
        System.out.println("wynik mnozenia= "+sum2);

        sum3=liczbaX%liczbaY;
        System.out.println("wynik modulo= "+sum3);

        sum4=liczbaX/liczbaY;
        System.out.println("wynik dzielenia= "+sum4);


    }


}
