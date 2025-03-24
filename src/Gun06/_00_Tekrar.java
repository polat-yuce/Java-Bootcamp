package Gun06;

import java.util.Scanner;

public class _00_Tekrar {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in); // tanımlanıyor.kendisi çalışmıyor

        System.out.print("Sayı giriniz=");
        int okunanSayi= oku.nextInt();  // kursör : oku.nextInt()

        System.out.println("okunanSayi = " + okunanSayi);
    }
}
