package practice01;

public class S01_Kisisel_Bilgiler {

    public static void main(String[] args) {

        /*
     İsim, soyisim, yaş, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            İsim: ...
            Soyisim: ...
            Yaş: ...
            Boy: ...
            Kilo: ...
     Not: Sadece bir adet "System.out.println(); kullanınız.
     */

        String name = "Bunyamin";
        String surname = "TIGLI";
        int age = 24;
        double height = 1.86;
        double weight = 74.2;

        System.out.println("Name: " + name + "\nSurname: " + surname + "\n\tAge: " + age + "\n\tHeight: " + height + "\n\tWeight: " + weight);

    }

}
