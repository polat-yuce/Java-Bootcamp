package Gun07;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın(fullName) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)
        // mesala İsmet Temur -> İsmet i ayrı yazdırın, Temur u yazdırın

        Scanner oku=new Scanner(System.in);

        System.out.print("Ad ve Soyad=");
        String adSoyad=oku.nextLine();

        int boslukIndex= adSoyad.indexOf(" "); // bosluğun olduğu yerin INDEX

        String ad = adSoyad.substring(0, boslukIndex);  // ismet
        String soyad = adSoyad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}
