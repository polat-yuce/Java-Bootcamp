package Gun07;

public class _14_StringReplaceFirst {
    public static void main(String[] args) {
        // ReplaceFirst : bir stringin içindeki karakter/lerin sadece ilkini
        // verilenle değiştirir

        String s1="Merhaba Dünya";
        System.out.println("s1 = " + s1);

        System.out.println("s1.replaceFirst(a,e) = " + s1.replaceFirst("a","e")); // Merheba Dünya
        System.out.println("s1.replaceFirst(a, ) = " + s1.replaceFirst("a","")); // Mrhba Dünya
        System.out.println("s1.replaceFirst(ba,de) = " + s1.replaceFirst("ba","de")); // Merhade Dünya
        System.out.println("s1.replaceFirst(a,aaa) = " + s1.replaceFirst("a","aaa")); // Merhaaaba Dünya
        System.out.println("s1.replaceFirst(a,***) = " + s1.replaceFirst("a","***")); // Merh***ba Dünya
        System.out.println("s1.replaceFirst(a,e).replaceFirst(b,c) = " + s1.replaceFirst("a","e").replaceFirst("b","c")); //Merheca Dünya

    }
}
