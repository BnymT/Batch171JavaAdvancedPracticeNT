package practice05.s03_encapsulation;

public class AracKiralamaUygulamasi {
    public static void main(String[] args) {

        Arac arac1 =new Arac("Honda", "Civic", "Tuplu",500);

        System.out.println(arac1);


        arac1.setGunlukKiraUcreti(600);
        System.out.println(arac1);      //Guncelleme yaptik


        arac1.getMarka();
        System.out.println(arac1.getMarka());




    }

}