package practice05.s01_inheritance;

public class Musteri {

    String musteriAdi;
    int musteriNo;
    double hesapBakiyesi;

    public Musteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {

        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;


    }

    public void paraYatirma(double para) {

        hesapBakiyesi += para;

        System.out.println("Hesabiniza " + para + " ₺ eklenmistir.");
        System.out.println("Yeni bakiyeniz: " + hesapBakiyesi + "₺");

    }

    public void paraCekme(double para){
        if (hesapBakiyesi >= para) {

            hesapBakiyesi -= para;

            System.out.println("Hesabinizdan " + para + " ₺ cekilmistir.");
            System.out.println("Yeni bakiyeniz: " + hesapBakiyesi + "₺");

        } else {

            System.out.println("Hesap bakiyeniz yeterli degildir.");
            System.out.println("Yeni bakiyeniz: " + hesapBakiyesi + "₺");

        }
    }

    @Override
    public String toString() {
        return  "Musteri Adi: " + musteriAdi +
                "\nMusteri No:" + musteriNo +
                "\nHesap Bakiyesi" + hesapBakiyesi;
    }
}
