package Gun09;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığı yazdırınız
        // VAR veya YOK şeklinde

//        hava  -> var desin
//        HAVA  -> var desin

        Scanner oku= new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cumle=oku.nextLine();

        boolean varMi = cumle.toLowerCase().contains("a"); //kuçuk harf haline a var mı
        //boolean varMi = cumle.toUpperCase().contains("A"); // büyük harf halinde a var mı

        if (varMi == true)
            System.out.println("VAR");

        if (varMi == false)
            System.out.println("YOK");

        System.out.println("cumle = " + cumle); // yukarıdaki toLowercase komutu değerini
                                                // değiştirmez
    }
}
