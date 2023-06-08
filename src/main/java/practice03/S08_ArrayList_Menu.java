package practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S08_ArrayList_Menu {

/*
        Bir restoraın menüsüne eklenecek öğeleri kullanıcıdan alarak List'e ekleyin ve menüyü ekrana yazdırın.
    */

    public static void main(String[] args) {
        List<String> menu = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String option;

        do {
            System.out.println("Menüye eklemek istediğiniz yemek: ");

            String food = input.nextLine();

            if (menu.contains(food)){

                System.out.println(food + " listede zaten var. Tekrar eklenemez.");

            }else {

                menu.add(food);
                System.out.println(food + " menüye eklendi.");

            }

            System.out.println("Başka yemek eklemek ister misin (E/H): ");

            option = input.nextLine();

        }while (option.equalsIgnoreCase("E"));

        System.out.println("Restoran Menüsü:");

        for (String yemek : menu){

            System.out.println("- " + yemek);

        }

    }
}
