package Gun15;

import java.util.Arrays;
import java.util.Scanner;

public class _02_SoruOrnek {
    public static void main(String[] args) {
        // dizi nasıl okunur ve nasıl yazdırılır

        // 10 elemanlı bir diziyi kullanıcıda sayı alarak doldurunuz ve yazdırınız.
        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[10];  // index 0-9

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+".Sayi=");
            dizi[i]=oku.nextInt();
        }
        System.out.println("******************");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Sayi "+(i+1)+" = " + dizi[i]);
        }

        // for döngüsünde duracak nokta olarak sabit son rakamı
        // vermek yerine, dizi.length şeklinde kullanılırsa,
        // daha sonradan dizi boyutu değiştirildiğinde ,
        // for ların son duracağı noktaları değiştirmek
        // zorunda kalmayız
    }
}
