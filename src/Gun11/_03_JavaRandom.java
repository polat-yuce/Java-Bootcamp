package Gun11;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {
        // Girilen min ve max aralığı sayı üretiniz
        // Aralık için Kural :  girilen aralık kadar sayı üret sonra alt sınırı ekle
        // Örneğin : 30 ile 70 arası Random sayı istiyorsam
        // 70-30 yani 40 kadar sayı üret buna alt sınırı yani 30 u ekle

        Scanner oku=new Scanner(System.in);
        System.out.print("Alt Sınırı giriniz="); int min=oku.nextInt();
        System.out.print("Üst Sınırı giriniz="); int max=oku.nextInt();

        int aralik=max-min;

        int rndSayi= (int)(Math.random()* aralik ) + min ; // aralık kadar üret+min

        System.out.println("rndSayi = " + rndSayi);
    }
}

//Math.Random() -> 0-0.9999999
//        Math.Random()*10 ->  0- 9.99999
//        (int)(Math.Random()*10) -> 0-9
//
// 15-25 arası bir Random sayı istiyorum
//
//Aralık miktarı 10
//Aralık miktarı kadar üret+  alt sınır ekle
//
//   0-9 arası üretecek + 15  -> 15-24