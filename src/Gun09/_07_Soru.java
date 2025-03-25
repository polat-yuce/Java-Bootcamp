package Gun09;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // Kullanıcının 2 kez gireceği şifresinin(String) aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)
        Scanner oku=new Scanner(System.in);

        System.out.print("Sifrenizi giriniz=");
        String sifre=oku.nextLine();

        System.out.print("Şifrenizi tekrar giriniz=");
        String sifreTekrar=oku.nextLine();


        if (sifre.equals(sifreTekrar))  // Şifreler eşit İSE   :true
            System.out.println("Şifreler AYNI");

        if (  !sifre.equals(sifreTekrar)   ) // Şifreler eşit DEĞİLse
            System.out.println("Şifreler AYNI DEĞİL");

    }
}
