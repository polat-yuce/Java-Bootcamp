package Gun09;

import java.util.Scanner;

public class _06_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal ifadeler
        // ve      &&
        // veya    ||
        // değil   !

        // Soru : girilen bir sayı 0 dan büyük ve 100 den küçük eşit
        // ise geçerli not , değil ise geçerli olmayan not

        Scanner oku=new Scanner(System.in);

        System.out.print("ogrNot=");
        int ogrNot=oku.nextInt();

        if (ogrNot >0 && ogrNot <= 100)  // 0,0 dan büyükse VE 100,100 den küçükse
            System.out.println("Geçerli not"); // true veya false , sonuc TRUE ise if çalışır
        else
            System.out.println("Geçersiz not");

        // 1.yöntem
        if (ogrNot < 0 || ogrNot > 100)  // 0 dan küçükse VEYA 100 den büyükse
            System.out.println("Geçerli not değil");

        // 2.yöntem
        if (  !(ogrNot >= 0 && ogrNot <= 100)   )  // burada ünlem verilen şart DEĞİLSE demektir
            System.out.println("Geçerli not değil");
    }
}
