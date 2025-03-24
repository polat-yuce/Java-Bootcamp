package Gun05;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan kilosunu(kg) double, boyunu(m) double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)
        Scanner oku=new Scanner(System.in);

        System.out.print("Kilonuz(kg) = "); double kilo=oku.nextDouble();
        System.out.print("Boyunuz(m)  = "); double boy=oku.nextDouble();

        System.out.println("Boyunuz="+boy+"m ve kilonuz= "+kilo+"kg");

        double index= kilo / (boy*boy);
        System.out.println("vucut kitle indexiniz = " + index);
    }
}
