package Gun07;

public class _02_StringEquals {
    public static void main(String[] args) {
        // Equals : 1 stringi diğeriyle eşit mi sorar
        // sonuç boolean

        String s1="merhaba";
        String s2="Merhaba";

        boolean sonuc= s1.equals(s2);  // s1 s2 ye eşit Mİ ? true değilse false
        System.out.println("esit Mi = "+sonuc); // false

        System.out.println("eşit Mİ = " + s1.equals(s2));  // false
        System.out.println("eşit Mİ = " + s1.equals("merhaba")); // true
    }
}
