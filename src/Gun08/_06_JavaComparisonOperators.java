package Gun08;

public class _06_JavaComparisonOperators {
    public static void main(String[] args) {
        int a=50;
        int b=50;

        // aşağıdaki işlemler SADECE sayılar ve boolenlar kullanılır
        System.out.println("a>b  = " + (a>b) ); // a b den büyük mü : false
        System.out.println("a>=b  = " + (a>=b) ); //a b den büyük veya eşit mi : true
        System.out.println("a<b  = " + (a<b) );  // a b den küçük mü : false
        System.out.println("a<=b  = " + (a<=b) ); // a b den küçük veya eşit mi : true
        System.out.println("a==b  = " + (a==b) );  // a b ye eşit mi? : true
        System.out.println("a!=b  = " + (a!=b) );  //  a b den farklı mı : false
    }
}
