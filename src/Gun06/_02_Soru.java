package Gun06;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde(string), Sokak(string) , PostaKodu(int) ve ülke(string)
        // evSahibi(boolean) şeklinde adres bilgisini alarak bir satırda yazdırınız.

        Scanner okuSayi=new Scanner(System.in);    // sayılar için bir tane
        Scanner okuKelime=new Scanner(System.in);  // kelimeler için bir tane tanımlayalaım ter tür için
        Scanner okuBoolean=new Scanner(System.in);

        System.out.print("Cadde="); String cadde=okuKelime.nextLine();
        System.out.print("Sokak="); String sokak=okuKelime.nextLine();
        System.out.print("Posta Kodu="); int postaKod=okuSayi.nextInt();
        System.out.print("Ülke="); String ulke=okuKelime.nextLine();
        System.out.print("Ev Sahibi misiniz (t/f) = "); boolean evSahibi=okuBoolean.nextBoolean();

        System.out.println("Adres = " + cadde+"\t"+sokak+" "+postaKod+" "+ulke+" "+evSahibi);
    }
}
