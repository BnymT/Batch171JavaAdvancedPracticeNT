package practice02;

import java.util.Arrays;

public class S08_Array_ETicaret {


    public static void main(String[] args) {

        /*
        Bir e-ticaret uygulamasında, bir kullanıcının sepetindeki ürünleri bir array'de tutuyorsunuz.
        Kullanıcının sepetinde belirli bir ürünün olup olmadığını kontrol edin.
        {"Telefon", "Bilgisayar", "Klavye", "Mouse"}
    */

        String eShop[] = {"Telefon", "Bilgisayar", "Klavye", "Mouse"};

        String whatWeNeed = "Klavye";

        for (String w : eShop) {

            if (w.equals(whatWeNeed)) {

                System.out.println("Aranan urun listede vardir.");

                break;

            }

        }


    }

}
