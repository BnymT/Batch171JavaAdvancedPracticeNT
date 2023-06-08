package practice03;

public class S02_PassByValue_SayiDuzenleme {

    public static void main(String[] args) {

        /*
        İçinde verilmiş bir sayının orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            int sayi = 42;
            - Sayıyı karesini alın.
            - Sayıyı küpünü alın.
            - Sayının karekökünü alın.
            - Sayının mutlak değerini alın.
            - Sayıyı 10 ile çarpın ve sonucu yazdırın.
    */

        int number = 42;

        System.out.println(getSquare(number)); // 1764

        System.out.println(getCube(number)); // 74088

        System.out.println(getSquareRoot(number)); // 6

        System.out.println(getAbsolute(number)); // 42

        System.out.println(multiplyByTen(number)); // 420

    }

    public static int getSquare(int number) {

        number = (int) Math.pow(number, 2);

        return number;

    }

    public static int getCube(int number) {

        number = (int) Math.pow(number, 3);

        return number;

    }

    public static int getSquareRoot(int number) {

        number = (int) Math.sqrt(number);

        return number;

    }

    public static int getAbsolute(int number) {

        number = Math.abs(number);

        return number;

    }

    public static int multiplyByTen(int number) {

        number *= 10;

        return number;


    }

}
