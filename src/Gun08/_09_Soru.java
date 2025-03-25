package Gun08;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi=oku.nextInt();

        //eğer sayı> 0 pozitif yaz
        if (sayi>0)
            System.out.println("pozitif");

        //eğer sayı< 0 negatif yaz
        if (sayi<0)
            System.out.println("Negatif");

        //eğer sayı  0 a eşit ise sıfır yaz
        if (sayi==0)
            System.out.println("sıfır");

    }
}
