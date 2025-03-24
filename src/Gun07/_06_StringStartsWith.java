package Gun07;

public class _06_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith("") : bunun la başlıyor mu ?
        // boolean sonuç döndürür

        String s1="Manisa";

        System.out.println("s1.startsWith(M) = " + s1.startsWith("M"));  // true
        System.out.println("s1.startsWith(Man) = " + s1.startsWith("Man"));  //true
        System.out.println("s1.startsWith(ni) = " + s1.startsWith("ni"));  // false
    }
}
