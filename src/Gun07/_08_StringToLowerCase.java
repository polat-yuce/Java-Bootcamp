package Gun07;

public class _08_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase : stringi küçük harfe çevirir

        String s1="Merhaba Dünya";

        System.out.println("s1 = " + s1); // Merhaba Dünya
        System.out.println("s1.toLowerCase() = " + s1.toLowerCase()); // küçük harfli halini yazar, s1 değişmez

        System.out.println("s1.startsWith(m) = " + s1.startsWith("m")); // false
        System.out.println("s1.toLowerCase().startsWith(m) = " + s1.toLowerCase().startsWith("m")); //true
                                                               // merhaba dünya
        System.out.println("s1 = " + s1); // yukarıdaki işlemler s1 etkilemz
    }
}
