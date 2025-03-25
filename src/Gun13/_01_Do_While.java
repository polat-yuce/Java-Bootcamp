package Gun13;

import java.util.Scanner;

public class _01_Do_While {
    public static void main(String[] args) {
        // Kullanıcı 0 değeri girene kadar sayı isteyiniz ve sayıları
        // toplayınız , 0 girdiğinde toplamı yazınız

        // While ın şartı nedir ? girilen 0 olmadığı sürece dönecek (sayi!=0)
        // Tekrar edecek adımlar : sayi iste, toplama sayıyı ekle

        Scanner oku=new Scanner(System.in);

        int toplam=0; int sayi;

        System.out.print("Sayi giriniz="); sayi=oku.nextInt();
        // Döngüye girip girmeyeceğine kullanıcının gireceği değer karar verecek
        while(sayi!=0)
        {
            toplam=toplam+sayi;
            System.out.print("Sayi giriniz="); sayi=oku.nextInt();
        }

        //*********************/

        do{ // Do_While döngüsünde 1 adım herzaman çalışır, sonra şart kontrol edilir.
            System.out.print("Sayi giriniz="); sayi=oku.nextInt();
            toplam=toplam+sayi;
        }while (sayi!=0);

        System.out.println("toplam = " + toplam);
       // Not: en az 1 kere çalıştıran döngüler içi DO_WHILE kullanılır


    }
}
// While : önce kontrol sonra döngü
// do_while : önce 1 kez çalış , sonra kontrol, sonra döngü

// kontrol önce ise WHİLE
// kontrol sonda ise DO_WHİLE