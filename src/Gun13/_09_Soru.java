package Gun13;

public class _09_Soru {
    public static void main(String[] args) {
        // 1 ila 100(dahil) arasındaki ÇİFT sayıların toplamını bulup yazdırınız.
        // b) Fakat toplamın değeri 1000 i geçitiğind eişlem dursun


        int toplam=0;
        for (int i = 2; i <=100 ; i+=2) {
            toplam=toplam+i;

            if (toplam>1000)
                break;  // çalıştığında içinde bulunduğu döngüyü bitirir kırar
        }

        System.out.println("toplam = " + toplam);
    }
}
