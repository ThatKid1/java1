package chooseyourownadventure;

import java.util.Scanner;

public class ChooseYourOwnAdventure {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean play = true;
        System.out.println("Welcome to my Role Play game.");
        System.out.println("Please capitalize all answers! Not like all of the way though. Just the first letter. KTHXBYE!");
        System.out.println("Would you like to play?");
        String Liketoplay = keyboard.nextLine();
        if (Liketoplay.equals("Yes")) {
            System.out.println("Well then lets play!");
        } else {
            System.out.println("Don't be a sour sport...Play with me! (Say 'ok sure' to play with me.)");
            String Try2 = keyboard.nextLine();
            if (Try2.equals("ok sure")) {
                System.out.println("Well then lets play!");
            } else {
                System.out.println("Fine...be that way!");
                play = false;
            }
        }
        if (play) {
            System.out.println("You start in a village. \n You get word that there is an evil wizard wreaking havoc across the lands. \n You assemble a team of honorable men to go with you to defeat him. \n There is the archer, the giant, the wizard, and you, the knight. \n You hear that that are 2 mountains that the wizard may be in. \n What do you do?");
            System.out.println("\tA) All go to mountain 1.");
            System.out.println("\tB) All go to mountain 2.");
            System.out.println("\tC) Split up.");
            System.out.println("\tD) Go to the bar.");
            String question1 = keyboard.nextLine();
            if (question1.equals("A")) {
                System.out.println("You reach the door and hit a tripwire killing all of your entourage with a boulder. \n What do you do now?");
                System.out.println("\tA) Keep going");
                System.out.println("\tB) Run Away");
                System.out.println("\tC) Weep");
                System.out.println("\tD) Go back to the bar");
                String quest1 = keyboard.nextLine();
                                                if (quest1.equals("A")) {
                                                    System.out.println("You enter and see 2 paths. Where do you go?");
                                                    System.out.println("\tA) Take path 1");
                                                    System.out.println("\tB) Take path 2");
                                                    System.out.println("\tC) Run Away");
                                                    System.out.println("\tD) Go back to the bar");
                                                    String quest11 = keyboard.nextLine();
                                                                    if (quest11.equals("A")) {
                                                                        System.out.println("You enter a room with endless chests. What do you do?");
                                                                        System.out.println("\tA) Open all of them");
                                                                        System.out.println("\tB) Go through the door at the end of the hallway");
                                                                        System.out.println("\tC) Run Away");
                                                                        System.out.println("\tD) Go back to the bar");
                                                                        String quest111 = keyboard.nextLine();
                                                                                                if (quest111.equals("A")) {
                                                                                                    System.out.println("Evil spirits and unimaginable creatures crawl out and kill you.");
                                                                                                    System.out.println("GAME OVER");
                                                                                                }
                                                                                                if (quest111.equals("B")) {
                                                                                                    System.out.println("You enter a room of armor and weapons. What do you do?");
                                                                                                    System.out.println("\tA) Take the best of their armor and weapons");
                                                                                                    System.out.println("\tB) Go through the door at the end of the hallway");
                                                                                                    System.out.println("\tC) Run Away");
                                                                                                    System.out.println("\tD) Go back to the bar");
                                                                                                    String quest112 = keyboard.nextLine();
                                                                                                                            if (quest112.equals("A")) {
                                                                                                                                System.out.println("You take the best of the armor and weapons. Now what?");
                                                                                                                                System.out.println("\tA) Go back to the city and sell them");
                                                                                                                                System.out.println("\tB) Go through the door at the end of the hallway");
                                                                                                                                System.out.println("\tC) Run Away");
                                                                                                                                System.out.println("\tD) Go back to the bar");
                                                                                                                                String quest113 = keyboard.nextLine();
                                                                                                                                                        if (quest113.equals("A")) {
                                                                                                                                                            System.out.println("You get buyers who promtly kill you for not defeated the wizard.");
                                                                                                                                                        }
                                                                                                                                                        if (quest113.equals("B")) {
                                                                                                                                                            System.out.println("You hear a voice and the wizard hovers down from the ceiling. You and your team attack and kill him.");
                                                                                                                                                            System.out.println("YOU WIN!");
                                                                                                                                                        }
                                                                                                                            }
                                                                                                }
                                                                    }
                                                                    if (quest11.equals("B")) {
                                                                        System.out.println("You enter a room with endless dead knights. What do you do?");
                                                                        System.out.println("\tA) Take the best of their armor and weapons");
                                                                        System.out.println("\tB) Go through the door at the end of the hallway");
                                                                        System.out.println("\tC) Run Away");
                                                                        System.out.println("\tD) Go back to the bar");
                                                                        String quest121 = keyboard.nextLine();                        
                                                                                                if (quest121.equals("A")) {
                                                                                                    System.out.println("You take the best of the armor and weapons. Now what?");
                                                                                                    System.out.println("\tA) Go back to the city and sell them");
                                                                                                    System.out.println("\tB) Go through the door at the end of the hallway");
                                                                                                    System.out.println("\tC) Run Away");
                                                                                                    System.out.println("\tD) Go back to the bar");
                                                                                                    String quest122 = keyboard.nextLine();
                                                                                                                            if (quest122.equals("A")) {
                                                                                                                                
                                                                                                                            }
                                                                                                }
                                                                    }
                                                                    if (quest11.equals("C")) {
                                                                        System.out.println("You are found by a beautiful maiden who you run away with. \n You live a peaceful life until the wizard finds you and kills you both.");
                                                                        System.out.println("GAME OVER");
                                                                    }
                                                                    if (quest11.equals("D")) {
                                                                        System.out.println("You reach the door of the bar and are killed by village people mad at you for not trying to defeat the wizard.");
                                                                        System.out.println("GAME OVER");
                                                                    }
                                                                }
                                                if (quest1.equals("B")) {
                                                    System.out.println("You live a peaceful life until the wizard finds you and kills you.");
                                                    System.out.println("GAME OVER");
                                                }
                                                if (quest1.equals("C")) {
                                                    System.out.println("You are found by a beautiful maiden who you run away with. \n You live a peaceful life until the wizard finds you and kills you both.");
                                                    System.out.println("GAME OVER");
                                                }
                                                if (quest1.equals("D")) {
                                                    System.out.println("You reach the door of the bar and are killed by village people mad at you for not trying to defeat the wizard.");
                                                    System.out.println("GAME OVER");
                                                }
                                            }
            if (question1.equals("B")) {
                System.out.println("You reach the door and hit a tripwire killing all of your entourage with a boulder. \n What do you do now?");
                System.out.println("\tA) Keep going");
                System.out.println("\tB) Run Away");
                System.out.println("\tC) Weep");
                System.out.println("\tD) Go back to the bar");
                String quest2 = keyboard.nextLine();
                                                if (quest2.equals("A")) {
                                                    System.out.println("You enter and see 2 paths. Where do you go?");
                                                    System.out.println("\tA) Take path 1");
                                                    System.out.println("\tB) Take path 2");
                                                    System.out.println("\tC) Run Away");
                                                    System.out.println("\tD) Go back to the bar");
                                                    String quest21 = keyboard.nextLine();
                                                                    if (quest21.equals("A")) {
                                                                        System.out.println("You enter a room with endless chests. What do you do?");
                                                                        System.out.println("\tA) Open all of them");
                                                                        System.out.println("\tB) Go through the door at the end of the hallway");
                                                                        System.out.println("\tC) Run Away");
                                                                        System.out.println("\tD) Go back to the bar");
                                                                    }
                                                                    if (quest21.equals("B")) {
                                                                        System.out.println("You enter a room with endless dead knights. What do you do?");
                                                                        System.out.println("\tA) Take the best of their armor and weapons");
                                                                        System.out.println("\tB) Go through the door at the end of the hallway");
                                                                        System.out.println("\tC) Run Away");
                                                                        System.out.println("\tD) Go back to the bar");
                                                                    }
                                                                    if (quest21.equals("C")) {
                                                                        System.out.println("You are found by a beautiful maiden who you run away with. \n You live a peaceful life until the wizard finds you and kills you both.");
                                                                        System.out.println("GAME OVER");
                                                                    }
                                                                    if (quest21.equals("D")) {
                                                                        System.out.println("You reach the door of the bar and are killed by village people mad at you for not trying to defeat the wizard.");
                                                                        System.out.println("GAME OVER");
                                                                    }
                                                                }
                                                if (quest2.equals("B")) {
                                                    System.out.println("You live a peaceful life until the wizard finds you and kills you.");
                                                    System.out.println("GAME OVER");
                                                }
                                                if (quest2.equals("C")) {
                                                    System.out.println("You are found by a beautiful maiden who you run away with. \n You live a peaceful life until the wizard finds you and kills you both.");
                                                    System.out.println("GAME OVER");
                                                }
                                                if (quest2.equals("D")) {
                                                    System.out.println("You reach the door of the bar and are killed by village people mad at you for not trying to defeat the wizard.");
                                                    System.out.println("GAME OVER");
                                                }
                                            }
            if (question1.equals("C")) {
                System.out.println("You reach the door, notice a tripwire, step over it, and go in. You see 2 paths. \n What do you do now?");
                System.out.println("\tA) Take path 1");
                System.out.println("\tB) Take path 2");
                System.out.println("\tC) Split up more");
                System.out.println("\tD) Go back to the bar");
                String quest3 = keyboard.nextLine();
                                                if (quest3.equals("A")) {
                                                
                                                }
                                                if (quest3.equals("B")) {
                                                
                                                }
                                                if (quest3.equals("C")) {
                                                
                                                }
                                                if (quest3.equals("D")) {
                                                    System.out.println("You reach the door of the bar and are killed by village people mad at you for not trying to defeat the wizard.");
                                                    System.out.println("GAME OVER");
                                                }
                                            }
            if (question1.equals("D")) {
                System.out.println("You reach the door of the bar and are killed by village people mad at you for not trying to defeat the wizard.");
                System.out.println("GAME OVER");
            }
        }
    }
}
