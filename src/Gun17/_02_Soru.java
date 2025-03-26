package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // 2x3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        // Daha sonra kullanıcıdan bir sayı alınız.Bu sayı tabloda
        // var ise yerini/yerlerini (satir,sütun) yazdırınız.

        int[][] tablo=new int[2][3];

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j]=(int)(Math.random()*11);
            }

        }

        for (int i = 0; i < tablo.length; i++) //opsiyonel
            System.out.println(Arrays.toString(tablo[i]));

        //Daha sonra kullanıcıdan bir sayı alınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int aranacakSayi=oku.nextInt();


        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {

                  if (tablo[i][j]==aranacakSayi)
                      System.out.println(i+" "+j);
                  }

        }

    }
}
