package Gun14;

public class _07_DebugOrnek {
    public static void main(String[] args) {

        for(int i = 0; i < 40; i++) {

            if( i / 15 == 1) {
                continue;  // acaba i nin hangi değerleri için çalışacak
            }

            System.out.println( i );
        }

    }
}
