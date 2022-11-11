public class Mars {
    public static void main (String[] args) throws InterruptedException {
        String colonyName = "Nate";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - (shipPopulation * .75) * 2;
        System.out.println(meals);
        meals = meals + (meals * .5);
        System.out.println(meals);
        shipPopulation += 5;
        System.out.println(shipPopulation);

        String landingLocation = "The Plain";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on The Plain!");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }

        landing = landingCheck(4);
       //new GuessingGame();
       //new MarsExpedition();
       new FindingsList();
    }
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("keep center");
            } else if ((minute % 2) == 0) {
                System.out.println("right");
            } else if ((minute % 3) == 0) {
                System.out.println("left");
            } else {
                System.out.println("calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;

    }
}

