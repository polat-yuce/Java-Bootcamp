package Gun13;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);

        System.out.print("Kaca kadar sayılari toplayalım=");
        int sinir=oku.nextInt();

        int toplam=0;
        for (int i = 0; i <= sinir; i++) {
            toplam=toplam+i;
        }

        System.out.println("toplam = " + toplam);

    }
}
