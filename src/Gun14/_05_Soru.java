package Gun14;

public class _05_Soru {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız
//
//        for(int satir=1; satir<=5; satir++) {
//
//            //yukarıdaki döngü bu döngüyü 5 kez çalıştır
//            for (int i = 1; i <= satir; i++)  // satır numarasına kadar çalış
//                System.out.print("*");
//
//            System.out.println();
//        }

        for (int i = 0; i <=5 ; i++) {

            for (int j = 0; j <i ; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <=5 ; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
