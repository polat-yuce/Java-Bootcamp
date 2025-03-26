package Gun25._02_Ornek;

public class Person {
    //özellikle
    String name;
    String surname;
    int age;

    //metodları,davranışları
    void bilgiYazdir()
    {
        //this : kendi
        System.out.println("Name :"+this.name);
        System.out.println("Surname :"+this.surname);
        System.out.println("Age :"+this.age);
    }

    void getBirthYear(){
        System.out.println("BirthYear ="+
                (2024-this.age));
    }



}
