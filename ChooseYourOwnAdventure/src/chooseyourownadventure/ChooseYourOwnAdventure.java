package chooseyourownadventure;

import java.util.Scanner;

public class ChooseYourOwnAdventure {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to my Role Play game.");
        System.out.println("Would you like to play?");
        String Liketoplay = keyboard.nextLine();
        if (Liketoplay.equals("yes")) {
            System.out.println("Well then lets play!");
        } else {
            System.out.println("Don't be a sour sport...Play with me! (Say 'ok sure' to play with me.");
            String Try2 = keyboard.nextLine();
            if (Try2.equals("ok sure")) {
                System.out.println("Well then lets play!");
            } else {
                System.out.println("Fine...be that way!");
            }
        }
        System.out.println("You start in a city. \n You get word that there is an evil wizard wreaking havoc across the lands. \n You assemble a team of honorable men to go with you to defeat him. \n There is the archer, the giant, the wizard, and you, the knight. \n You hear that that are 2 mountains that the wizard may be in. \n What do you do?");
        System.out.println("\tA) All go to mountain 1.");
        System.out.println("\tB) All go to mountain 2.");
        System.out.println("\tC) Split up.");
        System.out.println("\tD) Go to the bar.");
        String question1 = keyboard.nextLine();
        if (question1.equals("A")) {
            System.out.println("You reach the door and hit a tripwire killing all of your entourage with a boulder. \n What do you do now?");
            System.out.println("\tA) Keep going");
            System.out.println("\tB) Run Away");
            System.out.println("\tC) Go back to the city");
            System.out.println("\tD) Weep");
            String quest1 = keyboard.nextLine();
            if (quest1.equals("A")) {

            }
        }
        if (question1.equals("B")) {
            System.out.println("You reach the door and hit a tripwire killing all of your entourage with a boulder. \n What do you do now?");
            System.out.println("\tA) Keep going");
            System.out.println("\tB) Run Away");
            System.out.println("\tC) Go back to the city");
            System.out.println("\tD) Weep");
            String quest1 = keyboard.nextLine();
        }
        if (question1.equals("B")) {
            System.out.println("You reach the door and hit a tripwire killing all of your entourage with a boulder. \n What do you do now?");
            System.out.println("\tA) Keep going");
            System.out.println("\tB) Run Away");
            System.out.println("\tC) Go back to the city");
            System.out.println("\tD) Weep");
            String quest1 = keyboard.nextLine();
        }
        if (question1.equals("B")) {
            System.out.println("You reach the door and hit a tripwire killing all of your entourage with a boulder. \n What do you do now?");
            System.out.println("\tA) Keep going");
            System.out.println("\tB) Run Away");
            System.out.println("\tC) Go back to the city");
            System.out.println("\tD) Weep");
            String quest1 = keyboard.nextLine();
        }

    }
}
