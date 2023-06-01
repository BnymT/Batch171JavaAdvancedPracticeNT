package practice02;

public class S06_Array_NotOrtalamasi {

    public static void main(String[] args) {

        /*
        Bir öğrenci sınıfının notlarını içeren bir array verildiğinde,
        bu notların ortalamasını hesaplayan bir program yazın.
        {84, 91, 76, 85, 98}
    */

        double notes[] = {84, 91, 76, 85, 98};
        double noteAddition = 0;
        double result = 0;
;
        for (double w : notes) {

           noteAddition += w;

        }

        result = noteAddition / notes.length;

        System.out.println(result);
    }



}
