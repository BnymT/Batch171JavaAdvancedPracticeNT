package practice01;

public class S03_Hipotenus {

    public static void main(String[] args) {

         /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */

        double aSide = 3;
        double bSide = 4;
        double cSide = Math.sqrt(Math.pow(aSide , 2) + Math.pow(bSide , 2)); // Karekok alma kodu --> .sqrt us alma kodu --> .pow

        System.out.println(cSide);
    }

}
