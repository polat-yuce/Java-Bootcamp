package Gun15;

import java.util.Scanner;

public class _06_Split {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bugun hava cok guzel -> boşluk sayısı+1 kaç kelime olduğunu verir

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle=");
        String cumle=oku.nextLine();

        //1.Yöntem
        int boslukSayisi=0;
        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==' ')
                boslukSayisi++;

        }
        System.out.println("boslukSayisi = " + boslukSayisi);

        //2.Yöntem
        String[] kelimeler=cumle.split(" "); // cumleyi boşluğa göre parçala

        System.out.println("kelimeler.length = " + kelimeler.length);

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }

    }
}

//// Harfleri tersten yazdırma
//for(int i=cumle.length-1; i>0;i--)
//sout( cumle.charAt(i))
//
////Kelimeleri tersten yazdırma
//        for(int i=kelimeler.length-1; i>0;i--)
//sout( kelimeler[i])