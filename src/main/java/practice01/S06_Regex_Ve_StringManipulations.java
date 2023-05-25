package practice01;

import java.util.Scanner;

public class S06_Regex_Ve_StringManipulations {

    public static void main(String[] args) {

        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız.
       Ad ayrı, soyad ayrı sekilde ekrana yazdırınız.
       Örnek:
          Ad: Ali
          Soyad: Can
    */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter name and surname.");
        String nameSurname = input.nextLine();

        String name = nameSurname.split(" ")[0];
        String surname = nameSurname.split(" ")[1];

        System.out.println("Name: " + name +"\nSurname: " + surname);

    }

}
