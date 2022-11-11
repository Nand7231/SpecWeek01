


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame() {
        System.out.println("Hello!");
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        Random rand = new Random();

        int number = rand.nextInt(100);

        System.out.println("Guess a number between 1 to 100!");

        while (true) {

            int answer;
            try {
                answer = input.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next(); // need to progress past bad input
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (answer < 1 || answer > 100) {
                System.out.println("Nice try dummy but " + answer + " is not between 1 and 100");
            } else if (answer < number) {
                System.out.println("Too low!");
            } else if (answer > number) {
                System.out.println("Too High!");
            } else {
                System.out.println("Flamio Hotman!");
                break;
            }
        }


    }

    }


