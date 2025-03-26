package Gun18;

import java.util.Scanner;

public class _06_Metodlar {
    public static void main(String[] args) {
        // kullanıcıdan alınan bir sayının tek mi çift mi olduğunu bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi="); int sayi=oku.nextInt();


        tekMiCiftMiOkuYaz(sayi);
    }

    // Gönderilen sayi nın değeri, metoda gelenSayi olarak geçirildi
    public static void tekMiCiftMiOkuYaz(int gelenSayi){  // sayi=gelenSayi
        if (gelenSayi%2==0)
            System.out.println("Çift sayı");
        else
            System.out.println("Tek sayı");
    }



}
