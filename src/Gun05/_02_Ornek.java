package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {

        //önce okuma komutunu tanımla aynı sayı tanımla gibi
        Scanner okuyucu = new Scanner(System.in);  // komut tanımlandı

        System.out.print("Sayı giriniz=");
        int okudugunuVer=okuyucu.nextInt();  // sayı oku

        System.out.println("okudugunuVer = " + okudugunuVer);
    }
}
