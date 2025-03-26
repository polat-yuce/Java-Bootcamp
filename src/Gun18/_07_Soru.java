package Gun18;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // Main de girilen bir sayıyı , bir metoda göndererek ,pozitif mi negatif mi
        // olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi="); int sayi=oku.nextInt();

        pozitifNegatifYaz(sayi);
    }

    public static void pozitifNegatifYaz(int sayi){
        if (sayi>=0)
            System.out.println("pozitif");
        else
            System.out.println("negatif");
    }

}
