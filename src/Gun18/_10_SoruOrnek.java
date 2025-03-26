package Gun18;

import java.util.Arrays;

public class _10_SoruOrnek {
    public static void main(String[] args) {
        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla doldurunuz ve aynı fonksiyonda
        // yazdırınız.

        int[] dizi=new int[20];

        diziDoldurYazdir(dizi);
    }

    public static void diziDoldurYazdir(int[] dizi){

        for (int i = 0; i < dizi.length; i++) // parantex yok ise tek satır çalışır
            dizi[i]=(int)(Math.random()*100);

        System.out.println(Arrays.toString(dizi));
    }

}
