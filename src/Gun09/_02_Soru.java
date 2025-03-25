package Gun09;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
      // girilen bir sayının tek mi , çift mi olduğunu yazdırınız

        Scanner oku= new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        if ( sayi%2 == 0)
            System.out.println("Çift sayı");

        if ( sayi%2 == 1)
            System.out.println("tek sayı");
    }
}

//10%2 -> kalanı yani
//bölünemeyen kısmı 0

//        11%2 -> 1
//        21%2 -> 1
//        31%2 -> 1
//tek sayılar %2 -> 1

//        40%2 -> 0
//        50%2 -> 0
//çift sayılar%2 -> 0