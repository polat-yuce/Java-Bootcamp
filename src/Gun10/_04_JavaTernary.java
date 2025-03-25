package Gun10;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        if (sayi%2==0)
            System.out.println("Çift");
        else
            System.out.println("Tek");

        // if-else için kısa yöntem : Ternary operatör

        String sonuc =   sayi%2==0 ? "Çift" : "Tek" ;
                         // ? if            : değilse
        System.out.println("sonuc = " + sonuc);
    }
}
