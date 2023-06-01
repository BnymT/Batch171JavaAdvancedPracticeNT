package practice02;

import java.util.Scanner;

public class S01_For_Continue {

    public static void main(String[] args) {

         /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
    */

        Scanner input = new Scanner(System.in);

        int addition = 0;

    for (int i = 1; i < 6; i++) {


        System.out.println(i + ". sayiyi giriniz.");

        int number = input.nextInt();

        if (number > 5 && number < 10) {

            continue;

        }

    }

        System.out.println("Girdiginiz sayilarin toplami = " + addition);






    }

}
