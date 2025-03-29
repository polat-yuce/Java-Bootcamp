package Gun27._02_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    Book() // diğer yapıcı metdolar yazılınca bu da olmalı
    {
        this.name="";
        this.publishYear=0;
        this.author="";
    }

    Book(String name, int publishYear, String author)
    {
        this.name=name;
        this.author=author;
        this.publishYear=publishYear;
    }

    Book(String name)
    {
        this.name=name;
        this.author="";
        this.publishYear=0;
    }

    void kitapYazdir()
    {
        System.out.println(this.name+" "+this.author+
                 " "+this.publishYear);
    }

}
