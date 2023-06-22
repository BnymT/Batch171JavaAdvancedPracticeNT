package practice04;

public class S03_Varargs_KargoSirketi {
    public static void main(String[] args) {

         /*
        Bir kargo şirketi, gönderilen paketlerin toplam ağırlığını hesaplayan bir metot yazmanızı istiyor.
        Metot, paketlerin ağırlıklarını almalıdır. Paketlerin toplam ağırlığını döndüren ve
        hiç paket gönderilmediğinde 0 döndüren bir metot yazın.
    */
        double toplamA = toplamAgirlikHesaplama(1.5,2.8,1.7,35.98);
        System.out.println(toplamA);
    }

    private static double toplamAgirlikHesaplama(double ...paketler) {

        double toplamAgirlik =0;

        for (double agirlik : paketler) {
            toplamAgirlik += agirlik;

        }
        return toplamAgirlik;
    }

}