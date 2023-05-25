package practice01;

import java.text.DecimalFormat;

public class S02_Ortalama {

    public static void main(String[] args) {

         /*
        double sayi1 = 23.4;
        double sayi2 = 24.0;
        double sayi3 = 12;
        double sayi4 = 450.3;
        double sayi5 = 23000;

        Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */

        double number1 = 23.4;
        double number2 = 24.0;
        double number3 = 12;
        double number4 = 450.3;
        double number5 = 23000;

        double addition = number1 + number2 + number3 + number4 + number5;
        double average = addition/5;

        DecimalFormat df = new DecimalFormat("0.00"); // Sayilarin virgulden sonraki basamak sayisini degistirmek icin kullanilan method

        System.out.println("Average = " + df.format(average));

    }

}
