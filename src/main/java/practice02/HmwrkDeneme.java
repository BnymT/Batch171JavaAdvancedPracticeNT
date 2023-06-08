package practice02;

import java.util.Scanner;

public class HmwrkDeneme {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[]words={"Apple","Home","Garden","Collage","School"};
        String word=words[(int) (Math.random()*words.length)];
        char[]rightLetter=new char[word.length()];
        int life=5;


        System.out.println("Please enter a letter");
        for (int i=0;i<word.length();i++){
            rightLetter[i]='_';
        }
        while (life>0){
            System.out.println("The word: "+ String.valueOf(rightLetter));
            System.out.println("Life is.."+life);
            System.out.println("Guess a letter: ");
            char guess= scan.nextLine().charAt(0);

            boolean rightGuess= false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i)==guess) {
                    rightLetter[i]=guess;
                    rightGuess=true;

                }

            }
            if (rightGuess){
                System.out.println("That's amazing....Keep going");

            }else {
                life--;
                System.out.println("There is a mistake, your life is.."+life);
            }
            if (String.valueOf(rightLetter).equals(word)) {
                System.out.println("Congraculations, you won....");

                break;

            }
            if (life == 0) {

                System.out.println("Life is finish.The right answer is "+word);
                break;

            }
        }





    }

}
