package Gun07;

public class _03_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        // EqualsIgnoreCase
        // equals aynı çalışır sadece büyük küçük harf ayrımı yapmaz

        String s1="merhaba";
        String s2="MerHAba";

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // false
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2)); // true
    }
}
