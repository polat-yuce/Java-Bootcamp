package Gun30._02_Enum;

public class Ornek1Cozum {
    public static void main(String[] args) {

        Aylar ay= Aylar.EKIM;  // int sayi=5;

        switch (ay){
            case SUBAT: System.out.println(28); break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:System.out.println(31); break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL: System.out.println(30); break;
        }
    }
}
