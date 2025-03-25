package Gun13;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // bolum 2 : carpimin sonucu 10000 i geçtiğinde işlem sonlansın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sınırı giriniz=");
        int sinir=oku.nextInt();

        int carpim=1;
        for (int i = 1; i <= sinir; i++) {
            carpim=carpim*i;

            if (carpim>10000) {
                System.out.println("i = " + i);
                break;
            }
        }

        System.out.println("carpim = " + carpim);
    }
}
