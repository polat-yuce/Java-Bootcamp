package Gun38;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _05_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // Kullanıcını girdiği bir saat ve tarih ve her ikisin ni nasıl okuruz ?

        Scanner oku=new Scanner(System.in);
        System.out.print("Tarih giriniz (12.08.2024)= ");
        String strTarih=oku.nextLine();

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate tarih= LocalDate.parse(strTarih,f); // okunan stringi bu formata göre
        // Tarih e dönüştür

        System.out.println("tarih = " + tarih);


    }
}
