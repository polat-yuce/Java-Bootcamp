package Gun18;

import java.util.Scanner;

public class _05_Metodlar {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunuz yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi="); int sayi=oku.nextInt();

        //1.Yöntem
        if (sayi%2==0)
            System.out.println("Çift sayı");
        else
            System.out.println("Tek sayı");

        // 2.Yöntem
        tekMiCiftMiOkuYaz();
        tekMiCiftMiOkuYaz();
        tekMiCiftMiOkuYaz();
    }


    public static void tekMiCiftMiOkuYaz(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi="); int sayi=oku.nextInt();
        if (sayi%2==0)
            System.out.println("Çift sayı");
        else
            System.out.println("Tek sayı");
    }

}
