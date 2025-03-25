package Gun12;

import java.util.Scanner;

public class _06_While_Soru {
    public static void main(String[] args) {
        // Kullanıcının gireceği 6 sayıdan sadece tek
        // olanlarının toplamını bulunuz

        // sayi % 2 == 1  //kalan
        Scanner oku=new Scanner(System.in);
        int sayac=0,toplam=0;
        while(sayac < 6)
        {
            System.out.print("sayi="); int sayi=oku.nextInt();

            if (sayi%2==1)
              toplam=toplam+sayi;

            sayac++; // sayac=sayac+1;
        }

        System.out.println("toplam = " + toplam);
    }
}
