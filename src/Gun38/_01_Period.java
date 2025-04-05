package Gun38;

import java.time.LocalDate;
import java.time.Period;

public class _01_Period {
    public static void main(String[] args) {
        // Period : 2 tarih arasındaki farkı tutar
        // Sadece LocalDate lerde kullanılır

        LocalDate dogumTarihi= LocalDate.of(1978, 9, 25);
        LocalDate buGun= LocalDate.now();

        Period fark= Period.between(dogumTarihi, buGun);
        System.out.println("fark = " + fark);
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("Yaşınız = " + fark.getYears()+" Yaşındasınız ");

        System.out.println("**************************");

        Period period3Gun= Period.ofDays(3); // 3 günlük zaman dilimi
        Period period3Ay= Period.ofMonths(3); // 3 Aylık zaman dilimi

        System.out.println("***************************");
        LocalDate kursBaslangic=LocalDate.of(2024,6,3);
        Period kursSuresi=Period.ofMonths(6);
        LocalDate kursBitis= kursBaslangic.plus(kursSuresi);  // minus -, plus +
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());
    }
}
