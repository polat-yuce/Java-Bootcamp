package Gun17;

import java.util.Arrays;

public class _01_Soru {
    public static void main(String[] args) {
        // 2 ye 5 lik bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // kaç tane tek sayı olduğunu bulunuz.

        int[][] tablo=new int[2][5];

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j]=(int)(Math.random()*101);
            }

        }

        // ekrana yazdırma 1.Yöntem
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+" ");
            }
            System.out.println();
        }

        // ekrana yazdırma 2.Yöntem
        System.out.println(Arrays.toString(tablo[0]));
        System.out.println(Arrays.toString(tablo[1]));

        // ekrana yazdırma 3.Yöntem
        for (int i = 0; i < tablo.length ; i++)
            System.out.println(Arrays.toString(tablo[i]));

        // teklerin miktarını bulalım
        int tekMiktar=0;
        for (int i = 0; i < tablo.length; i++)
            for (int j = 0; j < tablo[i].length; j++)
                if (tablo[i][j]%2==1)
                    tekMiktar++;

        System.out.println("tekMiktar = " + tekMiktar);

    }
}
