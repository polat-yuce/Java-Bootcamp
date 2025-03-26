package Gun24._04_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        Ogrenci ogr2=new Ogrenci();
        Ogrenci ogr3=new Ogrenci();

        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
        int[] dizi=new int[50];
        ArrayList<Ogrenci> sinif=new ArrayList<>();

        Ogrenci[] ogrenciler=new Ogrenci[2];
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        for (int i = 0; i < ogrenciler.length; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Ad=");ogr.ad= okuStr.nextLine();
            System.out.print("Soyad=");ogr.soyad= okuStr.nextLine();
            System.out.print("Sinif=");ogr.sinif= okuInt.nextInt();
            System.out.print("Adres=");ogr.adres= okuStr.nextLine();
            System.out.println();
            ogrenciler[i]=ogr;
        }

        System.out.println("-------- Liste ----------");
        for (int i = 0; i < ogrenciler.length; i++) {

            System.out.println((i+1)+ ". Öğrenci ad : "+ogrenciler[i].ad);
            System.out.println((i+1)+ ". Öğrenci soyad : "+ogrenciler[i].soyad);
            System.out.println((i+1)+ ". Öğrenci sınıf : "+ogrenciler[i].sinif);
            System.out.println((i+1)+ ". Öğrenci adres : "+ogrenciler[i].adres);
            System.out.println();



    }
}
}