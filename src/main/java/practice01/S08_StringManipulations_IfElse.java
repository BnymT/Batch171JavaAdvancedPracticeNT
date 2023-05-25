package practice01;

import java.util.Scanner;

public class S08_StringManipulations_IfElse {

    public static void main(String[] args) {

        /*
        Kullanıcının girdiği bir String ifadenin son üç karakterini alarak bu üç karakteri String ifadenin başına ve sonuna ekleyen
        bir Java programı yazınız.
    */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = input.next();

        if (word.trim().length() < 4) {

            System.out.println("Please enter the word has 3 than more letters.");

        } else {

            String addWord = word.substring(word.length()-3,word.length());

            System.out.println(addWord + word + addWord);

        }

    }

}
