package practice06.s02_oop_project;

public class Runner {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Lion simba = new Lion("Simba", 8, "Lion");
        System.out.println(simba.getName());

        Lion mamba = new Lion("Mamba", 5, "Lion");

        System.out.println(mamba.getName());

//        zoo.addAnimal(simba);
//        zoo.addAnimal(mamba);

    }
}
