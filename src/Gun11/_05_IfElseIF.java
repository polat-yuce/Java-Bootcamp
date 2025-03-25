package Gun11;

import java.util.Scanner;

public class _05_IfElseIF {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  dersin not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Ders notunu giriniz=");
        int ogrNot = oku.nextInt();

        if ( ogrNot >= 90)
            System.out.println("A");
        else // ogrNot 90 dan küçükse buraya gelir
            if (ogrNot >= 80)
                System.out.println("B");
            else
                if (ogrNot >= 70)
                    System.out.println("C");
                else
                    if (ogrNot >= 60)
                        System.out.println("D");
                    else
                        if (ogrNot >= 40)
                            System.out.println("E");
                        else
                            System.out.println("F");

    }
}







