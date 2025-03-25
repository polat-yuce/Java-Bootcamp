package Gun10;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 50 tl, 5 saate kadar 100 tl, 5 den buyukse 120 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        // Eğer saat <= 3 ise 50 tl yaz
        // Eğer saat > 3 && saat <=5  ise 100 tl yaz
        // Eğer saat > 5 ise 120 tl

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir saat giriniz=");
        int saat=oku.nextInt();

        if (saat <= 3)
            System.out.println("50 ₺"); // ₺  alt+t

        if (saat > 3 && saat <= 5)
            System.out.println("100 ₺");

        if (saat > 5)
            System.out.println("120 ₺");


        //2.Yol
        if (saat <= 3)
            System.out.println("50 tl");
        else
        {  // 3 saaten fazla kaldı

               if (saat <= 5)
                   System.out.println("100 tl");
               else  // saat> 5
                   System.out.println("120 tl");
        }

    }
}
