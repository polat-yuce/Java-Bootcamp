package Gun12;

import java.util.Scanner;

public class _01_Switch_Soru {
    public static void main(String[] args) {
        // Bir basamaklı girilen bir sayının değerini,
        // yazı ile yazdırınız.
        // mesala 1-> bir,   2-> iki gibi.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir basamaklı sayı giriniz=");
        int sayi=oku.nextInt();

        switch (sayi){
            case 0: System.out.println("Sıfır"); break;
            case 1: System.out.println("bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println("üç"); break;
            case 4: System.out.println("dört"); break;
            case 5: System.out.println("beş"); break;
            case 6: System.out.println("altı"); break;
            case 7: System.out.println("yedi"); break;
            case 8: System.out.println("sekiz"); break;
            case 9: System.out.println("dokuz"); break;
            default: System.out.println("Hatalı giriş");
        }
    }
}
