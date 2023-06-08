package practice03;

public class S05_MethodOverloading_Kargo {

    public static void main(String[] args) {

        /*
        İki farklı method oluşturun.
          - İlk method, bir paketin ağırlığını parametre olarak alacak ve kargo ücretini hesaplayıp döndürecek.
          - İkinci method ise bir paketin ağırlığı ve boyutları parametrelerini alacak ve
            bu bilgilere göre kargo ücretini hesaplayıp döndürecek.
        Bu methodları kullanarak farklı paketlerin kargo ücretlerini hesaplayın.
    */

        System.out.println(cargoCalculating(25.8));
        System.out.println(cargoCalculating(25.8, 14.5));


    }

    public static double cargoCalculating (double weight) {

        double cargoPrice =  weight * 3.5;

        return cargoPrice;
    }

    public static double cargoCalculating (double weight, double size) {

        double cargoPrice = weight * 3.5 + size * 1.5;

        return cargoPrice;

    }

}
