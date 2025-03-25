package Gun14;

import java.util.Scanner;

public class _06_continue {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını 5 sayıdna sadece tekleri toplayınız.

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayi giriniz="); int sayi=oku.nextInt();

            if (sayi%2==1 || sayi%2==-1)
                toplam=toplam+sayi;
        }

        System.out.println("toplam = " + toplam);

        //2.Yol
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayi giriniz="); int sayi=oku.nextInt();  //6

            if (sayi%2==0)  // Sayı çift ise pas geç
                continue;  // çalıştığında kendinde sonraki adımları pass geçirir

            toplam=toplam+sayi;
        }


    }
}
