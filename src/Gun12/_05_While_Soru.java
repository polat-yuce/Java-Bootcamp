package Gun12;

import java.util.Scanner;

public class _05_While_Soru {
    public static void main(String[] args) {
        // Girilen 6 sayıdan sadece pozitif olanlarının
        // toplamını bulunuz

        // tekrarlanacak kısımlar: sayi iste,toplam, sayac artır
        // döngü şartı: 6 sayı iste sayac<6
        Scanner oku=new Scanner(System.in);
        int sayac=0, toplam=0;
        while(sayac<6)
        {
            System.out.print("Sayi="); int sayi=oku.nextInt();

            if (sayi>0)
               toplam=toplam+sayi;

            sayac=sayac+1;
        }

        System.out.println("toplam = " + toplam);
    }
}
