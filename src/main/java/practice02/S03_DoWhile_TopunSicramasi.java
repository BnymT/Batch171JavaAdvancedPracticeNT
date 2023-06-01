package practice02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S03_DoWhile_TopunSicramasi {

    public static void main(String[] args) {

        /*
        Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 ü kadar yerden yukarı doğru zıplamaktadır.
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen h yuksekligi giriniz");

        double high = input.nextDouble();
        int jump = 0;
        double totalDistance = 0;


        do {

                totalDistance += high;
                high *= 0.75;
                totalDistance += high;
                jump++;


        }while (high > 1);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Toplam ziplama adeti " + jump);
        System.out.println("Toplam mesafe " + totalDistance);

    }

}
