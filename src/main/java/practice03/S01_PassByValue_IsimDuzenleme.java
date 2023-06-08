package practice03;

public class S01_PassByValue_IsimDuzenleme {

    public static void main(String[] args) {

        /*
        String içinde verilmiş bir ismin orjinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            String isim = "Ali Veli Can";
            - Tüm harleri büyük yapın.
            - Tüm harfleri küçük yapın.
            - İsmin başına ünvan ekleyin.
            - Sadece ilk isim ve soyismi yazın ve orta ismi kısaltarak yazın (Örnek: Ali V. Can)
            - İsmin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
    */

        String name = "Ali Veli Can";

        System.out.println(name);

        System.out.println(toUpperCase(name));

        System.out.println(toLowerCase(name));

        System.out.println(addTitle(name));

        System.out.println(nameSurname(name));

        System.out.println(onlySurname(name));


    }

    public static String toUpperCase(String name) {

        name = name.toUpperCase();

        return name;
    }

    public static String toLowerCase(String name) {

        name = name.toLowerCase();

        return name;
    }

    public static String addTitle(String name) {

        name = "Dr. " + name;

        return name;
    }

    public static String nameSurname(String name) {

        String firstName;
        char secondNameLetter;
        String thirdName;

        firstName = name.split(" ")[0];
        secondNameLetter = name.split(" ")[1].charAt(0);
        thirdName = name.split(" ")[2];

        name = firstName + " " + secondNameLetter + ". " + thirdName;

        return name;
    }

    public static String onlySurname(String name) {

        char firstNameLetter;
        char secondNameLetter;
        String thirdName;

        firstNameLetter = name.split(" ")[0].charAt(0);
        secondNameLetter = name.split(" ")[1].charAt(0);
        thirdName = name.split(" ")[2].toUpperCase();

        name = firstNameLetter + "." + secondNameLetter + ". " + thirdName;

        return name;
    }



}
