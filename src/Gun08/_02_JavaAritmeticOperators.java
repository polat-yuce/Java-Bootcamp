package Gun08;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {
        // Java da aritmetik işlemler

        int a=9;
        int b=5;

        System.out.println("Toplama işlemi = " + (a+b) ); //14
        System.out.println("Çıkartma işlemi = " + (a-b) ); //4
        System.out.println("Çarpma işlemi = " + (a*b) ); //45

        System.out.println("Bölme işlemi = " + (a/b) ); // 1
        System.out.println("Bölme işlemi = " + (a/(double)b) ); // 1.8
        // normal sonuc 1.8, fakat bilgisayar 2 si de tam sayı tipinde ise, küsüratı atar
        // bu sebeple sonuç 1 olur, yuvarlama yapmaz, int/int bölüm sonucu int olur
        // küsüratlı sonuç istiyorsan ,işleme girenlerden en az birisi double olmalı

        int kalan= a%b ;  // 4  % işareti kalanı yani bölünemeyeni verir
        System.out.println("kalan = " + kalan);  // 4

    }
}
