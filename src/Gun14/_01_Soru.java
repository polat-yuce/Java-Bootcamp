package Gun14;

import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // Kullanıcının gireceği 5 sayıdan sadece tek sayıların toplamını yazdırınız.
        Scanner oku = new Scanner(System.in);

        int toplam=0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayı giriniz=");int sayi=oku.nextInt();

            if (sayi%2==1 || sayi%2==-1)  // sayi%2!=0
                toplam=toplam+sayi;
        }

        System.out.println("toplam = " + toplam);




    }
}
