package Gun09;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        if (sayi%2 == 0)
            System.out.println("Çift");
        else
            System.out.println("tek");
    }
}
