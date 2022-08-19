import java.util.*;

public class FindingLists {

    public FindingLists() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");
        List<String> rockList = new ArrayList<>();
        System.out.println("Rock data downloaded.");
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");
        System.out.println(rockList);
        System.out.println("Wait a second, that last one is not a rock. We need to delete it.");
        rockList.remove(3);
        System.out.println(rockList);
        System.out.println("Perfect");
        Thread.sleep(500);
        HashMap<String, String> fossilDirectory = new HashMap<>();
        System.out.println("Fossil Data Downloaded.");
        fossilDirectory.put("Bird", "Fossil");
        fossilDirectory.put("Fish", "Fossil");
        fossilDirectory.put("Tooth", "Fossil");
        System.out.println("Which fossils would you like to learn more about? (Spelling and Spacing is important)");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();
        if(fossilChoice.equalsIgnoreCase("Bird Fossil")){
            System.out.println("Fossil: " + fossilChoice + "\n Description: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\n Description: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\n Description: " + fossilDirectory.get(fossilChoice));
        }
        Thread.sleep(500);
        HashSet<String> suppliesBrought = new HashSet<>();
        HashSet<String> suppliesUsed = new HashSet<>();
        suppliesBrought.add("Food");
        suppliesBrought.add("Water");
        suppliesBrought.add("Medicine");
        suppliesUsed.add("Food");
        suppliesUsed.add("Water");
        System.out.println("Medicine");
    }

}
