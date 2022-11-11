import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome Back!");
        String[] rocks = {"rock", "weird rock", "smooth rock", "not rock"};
        System.out.println("Everything is downloaded!");

        for (int k = 0; k < rocks.length; k++) {
            System.out.println("rock " + k + " is " + rocks[k] + ".");
        }
        ArrayList<String> rocksList = new ArrayList<String>();
        rocksList.add("rock");
        rocksList.add("weird rock");
        rocksList.add("smooth rock");
        rocksList.add("not rock");

        System.out.println("We need to delete not rock!");

        rocksList.remove("not rock");
        System.out.println(rocksList);

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fissil has wings inplying it was capable of flight");
        fossils.put("Fish Fossil", "The fissil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unkown fossil");

        System.out.println("fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");

        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        if(answer.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + answer + "\nDescription" + fossils.get(answer));
        } else if (answer.equalsIgnoreCase("Fish")) {
            System.out.println(fossils.get(answer));
        } else if (answer.equalsIgnoreCase("Tooth")) {
            System.out.println(fossils.get(answer));
        }

        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<>();

        supplies.add("Oreos");
        supplies.add("Milk");
        supplies.add("Forks");

        supplies.remove("Forks");
        System.out.println("Supplies after expidition are " + supplies);
    }

}



