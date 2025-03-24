package Gun06;

import java.util.Scanner;

public class _01_BooleanOrnek {
    public static void main(String[] args) {
        // Kullanıcıya öğrenci misiniz şeklinde sorunuz.
        // Evet ise True, değil ise False cevabını veriniz,
        // ve alınan cevabı yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Öğrenci misiniz (true/false)= ");
        boolean cevap= oku.nextBoolean();  // true, True, TRUE girilebilir , true veya false
        // boolean : 2 değeri olan değişken
        System.out.println("cevap = " + cevap);
    }
}
