package practice05.s02_abstraction;

public class UniversiteKursYonetimi {

    public static void main(String[] args) {

        Isletme isletme = new Isletme();
        isletme.dersAdi = "Mikro Iktisat";
        System.out.println(isletme.kategoriAdi());

    }

}
