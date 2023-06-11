package practice03.S07_constructor_ogrenci;

public class Ogrenci {

    /*
        Ogrenci class'ı, öğrencinin adını, yaşını ve sınıfını temsil eden alanları içermelidir.
        Bu class'ın ir default constructor'ı, bir de parametreli constructor'ı olmalıdır.
        Bu class'ın değiken değerlerini ekrana yazdıran bir metot bulunmalıdır.

        Alıştırma: Ogrenci class'ına bir metot ekleyerek öğrencinin yaşını bir yıl arttıran bir işlem yapın.
            Bu metodu kullanarak bir öğrencinin yaşını bir yıl arttırın ve sonucu ekrana yazdırın.

        Alıştırma: Ogrenci class'ına bir metot ekleyerek öğrenciyi bir üst sınıfa geçiren bir işlem yapın.
            Bu metodu kullanarak bir öğrencinin sınıfını bir üst sınıfa geçirin ve sonucu ekrana yazdırın.

        Alıştırma: Ogrenci class'ına bir statik değişken ekleyin ve her bir öğrenci oluşturulduğunda bu değişkeni bir artırın.
            Bu sayede kaç adet öğrenci oluşturulduğunu takip edebilirsiniz.

        Alıştırma: Bir statik metot ekleyerek, parametre olarak aldığı iki öğrencinin değerlerinin
            eşit olup olmadığını karşılaştıran bir metot yazın ve sonucu ekrana yazdırın.
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
