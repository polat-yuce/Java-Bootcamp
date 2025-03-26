package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        int[][] tablo=new int[3][2];
        Scanner oku=new Scanner(System.in);

        int teklerMiktar=0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(i+" "+j+".Sayı=");
                tablo[i][j]=oku.nextInt();

                if (tablo[i][j]%2==1)
                    teklerMiktar++;
            }
        }

        int tekIndex=0;
        int[] tekler=new int[teklerMiktar];  // tekelrin sayısı kadar dizi açtım
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j]%2==1)
                    tekler[tekIndex++]=tablo[i][j];  // tek boyutlu diziye at
            }
        }

        System.out.println("tekler = " + Arrays.toString(tekler));



    }
}
