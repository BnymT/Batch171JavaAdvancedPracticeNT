package practice03.S07_constructor_ogrenci;

public class Ogrenci {

    /*
        Ogrenci class'ı, öğrencinin adını, yaşını ve sınıfını temsil eden alanları içermelidir.
        Bu class'ın ir default constructor'ı, bir de parametreli constructor'ı olmalıdır.
        Bu class'ın değiken değerlerini ekrana yazdıran bir metot bulunmalıdır.
    */

    public String name;
    public int age;
    public int rank;

    public Ogrenci(String name, int age, int rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public Ogrenci() {
        name = "";
        age = 0;
        rank = 0;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", rank = " + rank +
                '}';
    }
}
