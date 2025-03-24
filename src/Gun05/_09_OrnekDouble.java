package Gun05;

import java.util.Scanner;

public class _09_OrnekDouble {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Kilonuzu giriniz=");
        double kilo=oku.nextDouble();  // virgul le mi yazacağız, nokta ile mi ?
        // her bilgisayara göre değişebilir, hata vermeyen yöntem geçerli
        System.out.println("kilo = " + kilo); // ekrana herzaman noktalı yazacak
    }
}
