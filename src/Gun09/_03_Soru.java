package Gun09;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 ve 50 den büyükse
        // ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Öğrenci notu=");
        int ogrNot= oku.nextInt();

        if (ogrNot >= 50)   // > 49
            System.out.println("Tebrikler , geçtiniz");

        if (ogrNot < 50)   // <= 49
            System.out.println("Üzgünüz, kaldınız");
    }
}
