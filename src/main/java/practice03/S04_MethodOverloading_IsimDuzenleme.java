package practice03;

import java.util.Arrays;

public class S04_MethodOverloading_IsimDuzenleme {
    public static void main(String[] args) {

            /*
        İki farklı method oluşturun.
          - İlk method, bir ürün adını ve fiyatını parametre olarak alacak ve bu bilgileri ekrana yazdıracak.
          - İkinci method bir ürün adı, fiyatı ve indirim oranı parametrelerini alacak ve indirimli fiyatı ekrana yazdıracak.
        Bu methodları kullanarak farklı ürünleri ve indirim oranlarını ekrana yazdırın.
            String[] urunIsimleri = {"Kalem", "Defter", "Silgi", "Cetvel"};
            double[] urunFiyatlari = {10.99, 12.49, 8.99, 15.99};
    */

        String[] productName = {"Kalem", "Defter", "Silgi", "Cetvel"};
        double[] price = {10.99, 12.49, 8.99, 15.99};

        priceCalculating(productName[0], price[0]);
        priceCalculating(productName[0], price[0], 25);

        System.out.println(Arrays.toString(price));


    }

    public static void priceCalculating(String productName, double price) {

        System.out.println("productName = " + productName);
        System.out.println("price = " + price);

    }

    public static void priceCalculating(String productName, double price, double discountRate) {

        double discountedRate = price - (price * discountRate / 100);

        System.out.println("productName = " + productName);
        System.out.println("price = " + price);
        System.out.println("discountedRate = " + discountedRate);

    }

}
