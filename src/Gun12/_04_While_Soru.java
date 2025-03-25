package Gun12;

import java.util.Scanner;

public class _04_While_Soru {
    public static void main(String[] args) {
        //Girilen  5 tam sayının toplamının sonucunu yazdırınız

        // tekrarlanacak kısımlar : sayi iste, topla, sayac artır
        // tekrar şartı : sayac < 5
        Scanner oku=new Scanner(System.in);

        int sayac=0;
        int toplam=0;

        while(sayac<5){

            System.out.print("sayi =");  // sayı iste
            int sayi=oku.nextInt();

            toplam=toplam+sayi;  // gelen sayıyı toplama ekle

            sayac=sayac+1;    // sayacı artır
        }

        System.out.println("toplam = " + toplam);
    }
}
