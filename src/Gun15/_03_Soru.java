package Gun15;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        Scanner oku=new Scanner(System.in);

        int[] notlar=new int[5];

        int toplam=0;
        for (int i = 0; i < notlar.length; i++) {
            System.out.print((i+1)+".Notu girini=");
            notlar[i]=oku.nextInt();

            toplam+=notlar[i];
        }

        int ort=toplam/notlar.length;
        System.out.println("ort = " + ort);

        int gecenSayisi=0;
        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i]>=ort){ // bu not ortalamayı GEÇİYOR ise
                System.out.println(notlar[i]);
                gecenSayisi++; //gecenSayisi=gecenSayisi+1
            }

        }

        System.out.println("gecenSayisi = " + gecenSayisi);
    }
}
