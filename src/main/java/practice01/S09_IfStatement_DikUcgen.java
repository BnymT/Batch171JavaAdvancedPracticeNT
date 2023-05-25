package practice01;

import java.util.Scanner;

public class S09_IfStatement_DikUcgen {

    public static void main(String[] args) {

/*
        Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Not: Bir üçgenin dik olduğunu anlamak için a^2 + b^2 = c^2 pisagor bağlantısından yararlanabilirsiniz)
    */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 sides length for triangle.");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean firstReq = Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2);
        boolean secondReq = Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2);
        boolean thirdReq = Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2);

        if (firstReq || secondReq || thirdReq) {

            System.out.println("It's a straight triangle");

        } else {

            System.out.println("It is not a straight triangle");

        }
    }

}
