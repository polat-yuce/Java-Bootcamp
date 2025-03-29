package Gun29._01_StaticVariables._01_Ornek;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("ismet","temur");
        Ogrenci ogr2=new Ogrenci("mehmet","yılmaz");
        Ogrenci ogr3=new Ogrenci("Ayşe","Kaya");
        //...
        //...
        Ogrenci ogr500=new Ogrenci("Zeynep","Yılmaz");
        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar
        // tekrarlanması engellendi

        System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);
    }
}
