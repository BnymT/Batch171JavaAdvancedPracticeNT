package practice01;

import java.util.Scanner;

public class S07_String_Manipulations {

    public static void main(String[] args) {

        /*
        Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
        Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
        Örnek: Mark Hansel Twain ==> HT
    */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first name, middle name and surname in one line.");

        String fullName = input.nextLine();

        char middleName = fullName.toUpperCase().split(" ")[1].charAt(0);
        char surname = fullName.toUpperCase().split(" ")[2].charAt(0);

        System.out.println(middleName + "." + surname + ".");
    }

}
