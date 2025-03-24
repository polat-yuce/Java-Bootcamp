package Gun05;

import java.util.Scanner;

public class _08_Ornek {

    public static void main(String[] args) {
        //Bir dikdörtgen tarlanın gerekli kenar(int) uzunluklarını kullanıcıdan
        //isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b
        Scanner oku=new Scanner(System.in);

        System.out.print("Uzun kenar="); int uzun=oku.nextInt();
        System.out.print("Kısa kenar="); int kisa=oku.nextInt();

        System.out.println("Cevre =" + (2*uzun+2*kisa) );
        System.out.println("Alan =" +  (uzun*kisa) );
    }
}
