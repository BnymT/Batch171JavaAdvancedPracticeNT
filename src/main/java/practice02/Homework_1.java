package practice02;

import java.util.Scanner;

public class Homework_1 {

    public static void main(String[] args) {

           /*
        Amaç:
        Oyuncudan 1 ile 100 arasında bir sayı tahmini alarak rastgele bir sayıyı bulmaya çalışması istenir.
        Oyuncuya her tahminde doğru sayıya yaklaşıp yaklaşmadığına dair ipuçları verilir ve oyuncuya 10 tahmin hakkı tanınır.

        Yönergeler:
        - Oyuncuya "1-100 arası bir sayı tahmini giriniz" mesajı gösterilir.
        - Oyuncu bir sayı girişi yapar.
        - Oyuncunun tahmini, rastgele seçilen sayıya göre kontrol edilir:
            - Tahmin doğru ise, "Tebrikler, X. tahminde sayıyı buldunuz!" mesajı gösterilir.
              Ardından oyuncunun puanı hesaplanır ve "Puanınız: X" mesajı gösterilir (puan = kalan tekrar hakkı * 10) ve
              "Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın." mesajı gösterilir.
            - Tahmin, sayıdan küçük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha büyük bir sayı giriniz:" mesajı gösterilir.
            - Tahmin, sayıdan büyük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha küçük bir sayı giriniz:" mesajı gösterilir.
            - Oyuncuya 10 tahmin hakkı verilir. Oyuncu 10 tahmin hakkını da kullanırsa,
              "Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın."
              mesajı gösterilir.
            - Oyuncu 1'e basarsa, oyun yeniden başlatılır ve yeni bir rastgele sayı seçilir.
            - Oyuncu herhangi bir sayıya basarsa, oyun sona erer ve program sonlanır.
     */

        Scanner input = new Scanner(System.in);

        int counter = 1;
        String req = "";

        do {

            if (counter > 10) {

                counter = 1;

            }

            System.out.println("Lutfen bir sayi giriniz");

            int x = (int) Math.floor(Math.random() * 101);


            while (counter < 11) {

                int repoNum = input.nextInt();

                if (x == repoNum) {

                    System.out.println("Tebrikler! " + x + " sayisini buldunuz!");
                    break;

                } else if (x < repoNum) {

                    if (counter < 10) {
                        System.out.println("Sayini biraz daha kucultmelisin");
                    }
                    counter++;

                } else {

                    if (counter < 10) {
                        System.out.println("Sayini biraz daha arttirmalisin");
                    }
                    counter++;

                }
                if (counter > 10) {

                    System.out.println("Oyunu kaybettiniz tekrar oynamak için '1' e basiniz");

                    req = input.next();

                }

            }


        }while (req.equals("1"));

    }

}
