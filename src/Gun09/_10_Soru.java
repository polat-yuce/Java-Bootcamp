package Gun09;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        // Girilen sayı pozitif ve tek sayı ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        if (sayi>0 && sayi%2==1)
            System.out.println("Uygun sayı girildi");
        else
            System.out.println("Uygun sayı girilmedi");
    }
}
