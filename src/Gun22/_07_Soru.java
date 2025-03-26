package Gun22;

import Utility.MyFunc;

import java.util.Arrays;
import java.util.HashSet;

public class _07_Soru {
    public static void main(String[] args) {
        // 1 de 20 ye kadar (20 dahil) olan sayılardan random olarak
        // tekrar olmayacak şekilde 10 tane sini bir diziye atayınız
        // yani 10 tane random sayı istiyoruz ama içinde tekrar
        // olmayacak

//        HashSet<Integer> sayilar=new HashSet<>();
//        System.out.println("sayilar.size() = " + sayilar.size());
//
//        int donmeSayisi=0;
//        while(sayilar.size()<10) {  // size 10 olduğunda duracak
//            sayilar.add(MyFunc.RndSayiVer(21));
//            donmeSayisi++;
//        }
//
//        System.out.println("sayilar = " + sayilar);
//        System.out.println("donmeSayisi = " + donmeSayisi);

        HashSet<Integer> sayı=new HashSet<>();

        int dçnmesayısı=0;
        while (sayı.size()<10){
            sayı.add((int)(Math.random()*21));
            dçnmesayısı++;
        }

        System.out.println("sayı = " + sayı);
        System.out.println("dçnmesayısı = " + dçnmesayısı);



    }
}
