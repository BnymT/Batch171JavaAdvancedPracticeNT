package practice02;

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

        String[] words = {"Apple", "Home", "Garden", "Collage", "School"};

        //Apple ___l_
        Random rnd = new Random();

        int wordsIndex = rnd.nextInt(words.length);
        int life = 5;
        String word = words[wordsIndex];

        while (life > 0){

            System.out.println("Please enter a letter");
            System.out.println(underscore(word));
            System.out.println(word);
            String letter = input.next();


                for (int i = 0; i < word.length(); i++) {

                    if(word.charAt(i) == letter.charAt(0)){
                        char letter1 = underscore(word).charAt(i);
                        char letter2 = word.charAt(i);

                        String newWord = underscore(word).replace(letter1, letter2);

                        System.out.println(newWord);

                    }

                }
                if (!word.contains(letter)){
                System.out.println("Wrong letter");
                }

            life--;
        }

    }

    public static String underscore(String word) {

        String hiddenWord = word.replaceAll("[a-zA-Z]","_");

        return hiddenWord;
    }

}
