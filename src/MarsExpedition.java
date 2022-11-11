import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Starting");
        System.out.println(".....");
        System.out.println("YIP YIP");
        System.out.println("...");
        Thread.sleep(250);

        System.out.println("What is your name?");
        Scanner inputNew = new Scanner(System.in);
        String name = input.nextLine();


        System.out.println("Hi, — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String answer = input.nextLine();
        input.nextLine();
        if (answer.equalsIgnoreCase("Y")){
            System.out.println("Flamio hotman! Lets get goin!");
        } else {
            System.out.println("Too bad you are team leader. You have to go!");
        }

        System.out.println("How many do you want on your team? (enter just a number)");

        int teamAmount = input.nextInt();
        input.nextLine();

        if (teamAmount > 2) {
            System.out.println("Sorry too much we can only send 2 more members");
            teamAmount = 2;
        } else if (teamAmount < 2) {
            System.out.println("Sorry that is not enough! We need 3 going, including you!");
            teamAmount = 2;
        } else if (teamAmount == 2) {
            System.out.println("Perfect! That is all we need!");
        }

        System.out.println("You are allowed to bring one snack with you. What do you bring?");

        String snack = input.nextLine();

        System.out.println("Nice choice, you will be bringing a " + snack + " with you");

        System.out.println("You have the choice of 3 modes of transportation" +
                "\nA: Tundra" +
                "\nB: Space Ship" +
                "\nC: Flying Bison");
        String transport = input.nextLine();

        if (transport.equalsIgnoreCase("A")) {
            transport = "A Toyota Tundra";
        } else if (transport.equalsIgnoreCase("B")) {
            transport = "Space Ship";
        } else if (transport.equalsIgnoreCase("C")) {
            transport = "Appa";
        } else {
            transport = "Boots";
        }

        System.out.println("Looks like your ready!");
        System.out.println(name + "you are taking a " + transport + " with " + teamAmount + " people!");
        System.out.println("Starting in 5");
        System.out.println("4");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("Launch!");
    }
}







