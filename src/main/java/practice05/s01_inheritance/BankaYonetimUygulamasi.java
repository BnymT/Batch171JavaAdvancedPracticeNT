package practice05.s01_inheritance;

import java.time.LocalDate;

public class BankaYonetimUygulamasi {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1985,03,15);

        BireyselMusteriler bm = new BireyselMusteriler(
                "Ali Can",
                12345678,
                2000,
                "12345678910",
                dogumTarihi);

        System.out.println(bm.toString());


    }

}
