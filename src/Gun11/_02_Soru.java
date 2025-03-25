package Gun11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.
        // mesala 5 girersem 5 e kadar sayı üretsin, ben tahmin etmeye çalışayım

        Scanner oku=new Scanner(System.in);

        System.out.print("Kaça kadar sayı tutayım = ");
        int ustSinir=oku.nextInt(); //6

        int rndSayi= (int)(Math.random()*ustSinir); // 0-5 rası sayı üretecek

        System.out.print("Tahmininiz=");
        int tahmin=oku.nextInt();

        if (rndSayi == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedin ki, bilemedin ki "+rndSayi);
    }
}
