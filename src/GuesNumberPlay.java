import java.util.Scanner;

public class GuesNumberPlay {
    public static void play(){

        Scanner se = new Scanner(System.in);
        int currentNumber, numberToGuess, chance = 5;
        numberToGuess = (int) (100 * Math.random());

        do{
            System.out.println(String.format("You have %d chance(s) left",chance));
            System.out.println("Which is the number ?");
            currentNumber = se.nextInt();
            chance--;
        }while ((chance > 0)&&(currentNumber != numberToGuess));

        if (currentNumber == numberToGuess)
            System.out.println(String.format("Won, the number was %d",numberToGuess));
        else
            System.out.println(String.format("Failed, the number was %d",numberToGuess));

    }
}
