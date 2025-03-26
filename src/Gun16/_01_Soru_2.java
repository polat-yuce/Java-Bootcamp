package Gun16;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Soru_2 {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazdırınız.
        // bulunamadığında Sayı bulunamadı yazsın

        //10 elemanlı diziyi random sayılarla doldur 3,4,5,7,7,9,10,2,3
        int[] dizi=new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= (int)(Math.random()*11);
        }

        System.out.println("dizi = " + Arrays.toString(dizi)); // dizi random doldu mu ?

        //kullanıcıdan dizide aranacak sayıyı al
        Scanner oku=new Scanner(System.in);
        System.out.print("Aranacak sayiyi giriniz=");
        int arananSayi=oku.nextInt();

        // aranan sayı dizide var ise SAYI VAR diyecek
        boolean bulundu=false;
        for (int i = 0; i < dizi.length ; i++) {

            if (dizi[i] == arananSayi) {
                System.out.println("Sayı var "+i);
                bulundu=true;
                break;
            }
        }

        if (!bulundu)
            System.out.println("Sayı bulunamadı");

    }
}
