package practice03;

import java.util.Scanner;

public class S10_AracKiralama {

    public static void main(String[] args) {

         /*
        Üç farklı method oluşturun.
          - İlk method, bir aracın günlük kira bedelini parametre olarak alacak ve toplam kira bedelini hesaplayıp döndürecek.
          - İkinci method, bir aracın günlük kira bedeli ve kiralama süresi parametrelerini alacak ve toplam kira bedelini hesaplayıp döndürecek.
          - Üçüncü method ise bir aracın günlük kira bedeli, kiralama süresi ve indirim oranı parametrelerini alacak ve
            indirimli toplam kira bedelini hesaplayıp döndürecek.
        Bu methodları kullanarak farklı araçların kira bedellerini hesaplayın.
    */

        Scanner input = new Scanner(System.in);

        String[] carType = {"Sedan --> Daily Cost 100$", "Sport Car --> Daily Cost 500$", "SUV --> Daily Cost 200$", "Muscle Car --> Daily Cost 400$"};
        String[] sedanCars = {"Volvo S60", "BMW 3 Series", "Ford Focus", "Honda Civic", "Audi A3"};
        String[] sportCars = {"Volvo S90", "BMW M4 Series", "Ford GT-3D", "Honda NSX", "Audi A8"};
        String[] SUV = {"Volvo S60", "BMW X", "Ford Explorer", "Honda CR-V", "Audi Q3"};
        String[] muscleCars = {"Chevrolet Camaro SS", "Ford Mustang", "Dodge Challenger", "Pontiac Tempest"};

        int entry = carType(carType);

        switch (entry) {
            case 1 -> sedanCars(sedanCars);
            case 2 -> sportCars(sportCars);
            case 3 -> SUV(SUV);
            case 4 -> muscleCars(muscleCars);
            default -> System.out.println("Invalid entry");
        }

        switch (entry) {
            case 1, 2, 3, 4 -> {
                int carSelection = input.nextInt();
            }
            default -> System.out.println("Invalid entry");
        }

        int totalCost = totalCost(entry);

        System.out.println("The total cost is = " + totalCost(entry) + "$");

        System.out.println(discountedCost(totalCost));

    }

    public static int carType(String[] carType) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your car type selection with number");

        for (int i = 1; i <= carType.length; i++) {

            System.out.println(i + ") " + carType[i - 1]);

        }

        return input.nextInt();

    }

    public static void sedanCars(String[] sedanCars) {

        System.out.println("Please enter your car choice with number");

        for (int i = 1; i <= sedanCars.length; i++) {

            System.out.println(i + ") " + sedanCars[i - 1]);

        }


    }

    public static void sportCars(String[] sportCars) {

        System.out.println("Please enter your car choice with number");

        for (int i = 1; i <= sportCars.length; i++) {

            System.out.println(i + ") " + sportCars[i - 1]);

        }

    }

    public static void SUV(String[] SUV) {

        System.out.println("Please enter your car choice with number");

        for (int i = 1; i <= SUV.length; i++) {

            System.out.println(i + ") " + SUV[i - 1]);

        }

    }

    public static void muscleCars(String[] muscleCars) {

        System.out.println("Please enter your car choice with number");

        for (int i = 1; i <= muscleCars.length; i++) {

            System.out.println(i + ") " + muscleCars[i - 1]);

        }

    }

    public static int dailyCost(int entry) {

        int dailyCost = 0;

        switch (entry) {
            case 1 -> dailyCost = 100;
            case 2 -> dailyCost = 500;
            case 3 -> dailyCost = 200;
            case 4 -> dailyCost = 400;
            default -> System.out.println("Invalid entry");
        }

        return dailyCost;

    }

    public static int totalCost(int entry) {

        Scanner input = new Scanner(System.in);

        int totalCost;

        System.out.println("How many days will you rent the vehicle?");

        int day = input.nextInt();

        totalCost = dailyCost(entry) * day;

        return totalCost;
    }

    public static int discountedCost(int totalCost) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age for learn discount rate");

        int age = input.nextInt();

        if (age > 60) {

            totalCost -= (totalCost/15);

        } else if (age > 35) {

            totalCost -= (totalCost/10);

        } else if (age > 17) {

            totalCost -= (totalCost/25);

        } else {

            System.out.println("Your age is too young for car renting");

        }

        return totalCost;

    }
}
