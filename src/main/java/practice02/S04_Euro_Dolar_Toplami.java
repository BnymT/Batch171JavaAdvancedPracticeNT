package practice02;

import java.util.Arrays;

public class S04_Euro_Dolar_Toplami {

    public static void main(String[] args) {

        /*
        Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
        String str ="$1 $12 €34 €56 $45 €78";
        dolarToplami: 58
        euroToplami: 168
    */

        String str = "$1 $12 €34 €56 $45 €78";
        String [] money = str.split(" ");
        int totalDollar = 0;
        int totalEuro = 0;

        System.out.println(Arrays.toString(money));

        for (String w : money) {

            if (w.startsWith("$")){

               Integer moneyDollar = Integer.valueOf(w.substring(1));
               totalDollar += moneyDollar;

            } else if (w.startsWith("€")) {

                Integer moneyEuro = Integer.valueOf(w.substring(1));
                totalEuro += moneyEuro;

            }

        }

        System.out.println("Total Dollar ($) = " + totalDollar);
        System.out.println("Total Euro (€) = " + totalEuro);

    }

}
