package practice02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_2 {

    public static void main(String[] args) {

         /*
        Kelime Tahmin Oyunu
        Kullanıcının bir kelimeyi harf harf tahmin ederek doğru kelimeyi bulmasını sağlayan bir oyun geliştirin.
        Oyun şu adımları içermelidir:

        - Bir kelime listesi tanımlayın. Bu listede en az 5 farklı kelime bulunsun.
        - Oyuncu, listeden rastgele seçilen bir kelimeyi tahmin etmeye çalışmalıdır.
        - Oyuncuya, seçilen kelimenin uzunluğu kadar alt tire "_" işaretinden  oluşan bir dizi gösterilmelidir.
          Örneğin, seçilen kelime "elma" ise "____" şeklinde bir gösterim yapılmalıdır.
        - Oyuncu, her tahmininde bir harf girmelidir.
            - Girdiği harf, seçilen kelimede bulunuyorsa, doğru tahmin olduğu belirtilmeli ve
              ilgili harf yerine konulmalıdır.
            - Oyuncu, yanlış tahminlerde bulunduğunda, kalan hakkı azalmalıdır.
              Başlangıçta oyuncunun 5 hakka sahip olduğu varsayılmalıdır.
        - Oyuncunun doğru kelimeyi bulması durumunda, tebrik mesajı gösterilmeli ve oyun sonlandırılmalıdır.
        - Oyuncunun kalan hakları sıfır olduğunda, olumsuz bir mesaj ve doğru kelime gösterilmelidir.
     */

        Scanner input = new Scanner(System.in);

        String words[] = {"Elma", "Araba", "Çim", "Su", "Monitor"};
        Random random = new Random();
        int whichOne = random.nextInt(words.length);
        String blank = "";
        int count = 1;

        if (words[whichOne] == "Elma") {

            blank = words[whichOne];

            blank.replaceAll("[A-Za-z]","_");

            System.out.println("Lutfen harf giriniz");

            do {

                System.out.println(blank);

                String letter = input.next();

                if (words[whichOne].contains(letter)){




                count++;
                }

            } while(count < 6);

        }



    }

}
