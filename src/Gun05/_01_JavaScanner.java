package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {

    public static void main(String[] args) {
        //tipi  adı    başlangıç değer
        int   sayi=  0;

        // tipi     adı     başlangıç değeri
        Scanner okuyucu= new Scanner(System.in); // System.in : klavyeden oku

        System.out.print("Sayi giriniz="); // ne istendiği bilnsin diye yazıldı
        int girilenSayi=okuyucu.nextInt();  // klavyeden int girilebilir

        System.out.println("girilenSayi = " + girilenSayi);
    }
    
}
