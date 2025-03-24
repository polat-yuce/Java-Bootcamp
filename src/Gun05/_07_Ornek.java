package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan bir kenarı alınan kare
        // şeklinde tarlanın çevresini bulup yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("tarlanın bir kenar uzunluğu=");
        int kenar=oku.nextInt();

        System.out.println("Çevre = " + (4*kenar) );
    }
}
