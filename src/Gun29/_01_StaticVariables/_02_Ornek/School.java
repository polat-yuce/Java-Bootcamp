package Gun29._01_StaticVariables._02_Ornek;

public class School {
    public static void main(String[] args) {
        Student std1=new Student(1,"İsmet temur");
        Student std2=new Student(2,"Ayşe Yılmaz");
        Student std3=new Student(4,"Mehmet Kaya");
        Student std4=new Student(5,"Çilem Yıldız");

        // Öyle bir şey olsunki idler sıralı
        // eşssiz gitsin

        Student std11=new Student("İsmet temur");//1
        Student std12=new Student("Ayşe Yılmaz");//2
        Student std13=new Student("Mehmet Kaya");//3
        Student std14=new Student("Çilem Yıldız");//4
        // new dendiğind ebütün this li değişkenler
        // başlangıç haline döner

        System.out.println("std11 = " + std11);
        System.out.println("std12 = " + std12);
        System.out.println("std13 = " + std13);
        System.out.println("std14 = " + std14);

        System.out.println("Student.sayac = " +
                Student.sayac);
    }
}
