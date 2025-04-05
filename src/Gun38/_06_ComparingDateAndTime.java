package Gun38;

import java.time.LocalDate;

public class _06_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGun=LocalDate.now();
        LocalDate dun=buGun.minusDays(1); // dün

        System.out.println("dun = " + dun);

        boolean sonraMi= buGun.isAfter(dun); // bugün dünden sonra mı
        System.out.println("sonraMi = " + sonraMi); // true

        boolean onceMi= buGun.isBefore(dun); // bugun dun den önce mi
        System.out.println("onceMi = " + onceMi); // false

        boolean esitMi= buGun.isEqual(dun); // bugun dun e esit Mi
        System.out.println("esitMi = " + esitMi);

        boolean artikYil = buGun.isLeapYear();
        // bugun yılı Artık yıl mı, yani Şubat 29 gün mü
        System.out.println("artikYil = " + artikYil);

    }
}
