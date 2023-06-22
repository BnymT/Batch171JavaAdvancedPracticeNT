package practice04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class S01_Datetime_Gunleri {
    public static void main(String[] args) {

         /*
        Kullanıcıdan alınan bir tarihin haftanın hangi gününe denk geldiğini bulan bir program yazmanız isteniyor.
        Kullanıcıdan yıl, ay ve gün bilgilerini alarak, tarihin hangi gün olduğunu bulan bir Java programı yazın.
        Sonuç olarak, tarihin haftanın hangi gününe denk geldiğini Türkçe olarak ekrana yazdırın.
    */

        Scanner input =new Scanner(System.in);
        System.out.println("Yil, ay, gun bilgisini sayisal olarak giriniz");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate date =LocalDate.of(year,month,day);

        DayOfWeek dayOfName = date.getDayOfWeek();
        System.out.println(dayOfName);

        //2.Yol
        String dayOfName2 =date.getDayOfWeek().name();
        System.out.println(dayOfName2);


        switch (dayOfName2){
            case "MONDAY":
                System.out.println("Girdiğiniz tarih PAZARTESİ gününe denk gelmektedir.");
                break;
            case "TUESDAY":
                System.out.println("Girdiğiniz tarih SALI gününe denk gelmektedir.");
                break;
            case "WEDNESDAY":
                System.out.println("Girdiğiniz tarih ÇARŞAMBA gününe denk gelmektedir.");
                break;
            case "THURSDAY":
                System.out.println("Girdiğiniz tarih PERŞEMBE gününe denk gelmektedir.");
                break;
            case "FRIDAY":
                System.out.println("Girdiğiniz tarih CUMA gününe denk gelmektedir.");
                break;
            case "SATURDAY":
                System.out.println("Girdiğiniz tarih CUMARTESİ gününe denk gelmektedir.");
                break;
            case "SUNDAY":
                System.out.println("Girdiğiniz tarih PAZAR gününe denk gelmektedir.");
                break;
        }
    }



}
