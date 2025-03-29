package Gun27._02_Constructor;

public class libraryMain {
    public static void main(String[] args) {
        Book kit1=new Book();
        kit1.name="Harry Poter";
        kit1.author="JK Rowling";
        kit1.publishYear=1997;

        Book kit2=new Book("yüzükler",1954,"JRR Tolkien");

        Book kit3=new Book("çay ve kuru üzüm");

        kit1.kitapYazdir();
        kit2.kitapYazdir();
        kit3.kitapYazdir();
    }
}
