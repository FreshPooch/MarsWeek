import java.util.Scanner;

public class Mars {

        public static void main(String[] args) throws InterruptedException {
            String colonyName = "New Earth";
            int shipPopulation = 300;
            double shipFood = 4000.00;
            boolean landing = true;
            shipFood = shipFood - (shipPopulation * .75);
            shipFood = shipFood - (shipPopulation * .75);
            System.out.println(shipFood);
            shipFood = shipFood + (shipFood * .5);
            shipPopulation += 5;
            String landingLocation = "the plain";
            if(landingLocation.equalsIgnoreCase("the plain")){
                System.out.println("Bbzzz, landing on the Plain");
            }
            else {
                System.out.println("Error!!! Flight path already set. Landing on the Plain.");
            }

             landing = landingCheck(100);
            new GuessingGame();
            new MarsExpedition();

        }

        public static boolean landingCheck(int loops) throws InterruptedException{
            for(int i = 0; i <= loops; i++){
                if(i % 15 == 0){
                    System.out.println("Keep Center");
                }
                else if (i % 5 == 0) {
                    System.out.println("Right");
                }
                else if(i % 3 == 0) {
                    System.out.println("Left");
                }
                else {
                    System.out.println("Calculating");
                }
                Thread.sleep(250);
            }
            System.out.println("Landed.");
            return false;
        }

}
