package Gun13;

import java.util.Scanner;

public class _03_Do_While_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan H  girilene kadar ekrana "Program devam ediyor" yazan
        // ve H girildiğinde ise "Program bitti" yazıp, programdan çıkılsın.

        // tekrar edecek kısım: cevap iste, ve ekrana mesajı yaz
        // döngünü şartı : cevap != "H",  cevap=="E"

        // while mı doWhile mı ?  önc eişlem sonra kontrol olduğundan DoWhile
        Scanner oku = new Scanner(System.in);
        String cevap;

        do{
            System.out.print("Devam Mı= "); cevap= oku.next(); // E,e
            System.out.println("Program devam ediyor");
        }while(cevap.equalsIgnoreCase("E"));

        System.out.println("Program bitti");



    }
}
// equalsIgnoreCase : büyük veya küçük kabul ediyor
// Döngüleri %80 yeni göreceğimiz, %18 while, %2 do_While