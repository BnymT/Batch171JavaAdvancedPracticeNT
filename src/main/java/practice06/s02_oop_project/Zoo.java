package practice06.s02_oop_project;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private List<Guests> guests = new ArrayList<>();

    public void addAnimal(Animal animal){

        animals.add(animal);
    }

    public void addGuest(Guests guest){
        guests.add(guest);
    }

    public void listAnimals() {
        System.out.println("___The List of Animals___");
        System.out.println(animals);
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " +animal.getAge());
            System.out.println("Type: " +animal.getType());
            System.out.println("______________________________");
        }
    }

    public void tableTheAnimals() {
        System.out.printf("%-10s %-10s %-10s %n", "Name","Age","Type");
        System.out.println("______________________________");
        for (Animal animal : animals) {
            System.out.printf("%-10s %-10s %-10s %n", animal.getName(), animal.getAge(), animal.getType());


        }
    }
}
