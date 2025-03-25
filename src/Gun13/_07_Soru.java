package Gun13;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // Kullanıcının gireceği 5 sayının toplamını bulunuz ve yazdırınız.
        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayı giriniz="); int sayi=oku.nextInt();
            toplam=toplam+sayi;
        }

        System.out.println("toplam = " + toplam);
    }
}
