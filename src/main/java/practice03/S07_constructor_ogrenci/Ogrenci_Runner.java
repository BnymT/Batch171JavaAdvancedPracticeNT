package practice03.S07_constructor_ogrenci;

public class Ogrenci_Runner {

    public static void main(String[] args) {

        Ogrenci student1 = new Ogrenci();

        student1.name = "Bunyamin";
        student1.age = 24;
        student1.rank = 1;
        System.out.println(student1);

        Ogrenci student2 = new Ogrenci("Emine", 30,1);
        System.out.println(student2);

        Ogrenci student5 = new Ogrenci("Ali", 13,2);
        System.out.println(student5);

        // Alıştırma: Bir öğrencinin adını ve sınıfını güncelleyin ve değerlerini ekrana yazdırın
        student2.name = "Mehmet";
        System.out.println(student2);


    }

}
