package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in); // 1 kere tanımlanıyor

        System.out.print("Adınızı giriniz=");
        String isim= oku.nextLine(); // string tüm satırı oku

        System.out.print("Soyadınızı giriniz=");
        String soyisim= oku.nextLine(); // string tüm satırı oku

        System.out.println(isim+" "+soyisim);

        /*
             oku.next()      -> bir kelime okur
             oku.nextLine()  -> satirin sonuna kadar bütün kelimeleri okur

             oku.nextInt()   -> bir int tam sayı okur
             oku.nextShort() -> bir short tam sayı okur
             oku.nextByte()  -> bir byte tam sayı okur
             oku.nextLong()  -> bir long tam sayı okur

             oku.nextFloat() -> bir ondalıklı sayı okur(noktadan sonra 5 hane)
             oku.nextDouble()-> bir ondalıklı sayı okur(noktadan sonra 16 hane)

             oku.nextBoolean()-> bir boolean değer okur (true/false)
         */
    }
}
