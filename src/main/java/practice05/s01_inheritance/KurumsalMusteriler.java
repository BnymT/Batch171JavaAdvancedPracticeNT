package practice05.s01_inheritance;

public class KurumsalMusteriler extends Musteri {
    String vergiNo;
    String sirketName;

    public KurumsalMusteriler(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        super(musteriAdi, musteriNo, hesapBakiyesi);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nBireysel Musteriler" +
                "\nVergi No: " + vergiNo +
                "\nSirket Adi: " + sirketName;
    }
}
