package practice02;

import java.util.Arrays;

public class S05_Array_IsaretDegistir {

    public static void main(String[] args) {

        /*
        Array içerisindeki elementlerin işaretlerini (+-) değiştiren bir kod yazınız.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
    */

        int numbers[] = {1, 2, -3, 4, -5, -6};
        int index = 0;

        for (int w : numbers) {

            numbers[index] *= -1;
            index++;

        }

        System.out.println(Arrays.toString(numbers));

    }

}
