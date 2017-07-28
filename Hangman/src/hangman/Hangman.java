package hangman;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    static ArrayList<Character> word;
    static ArrayList<Character> guessed;

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList();
        String FILENAME = "Hangman Words";
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            while (currentLine != null) {
                words.add(currentLine);
                currentLine = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner keyboard = new Scanner(System.in);

        boolean playing = true;
        while (playing) {
            String str = words.get((int) (Math.random() * words.size()));
            word = new ArrayList<Character>();
            guessed = new ArrayList<Character>();
            for (char c : str.toCharArray()) {
                word.add(c);
            }

            int tries = 0;
//prints the word with dashes for unguessed letters
            while (tries < 10) {
                for (char l : word) {
                    if (guessed.contains(l)) {
                        System.out.print(l);
                    } else {
                        System.out.print("-");
                    }
                }

                System.out.println();

                if (won()) {
                    System.out.println("Good job...this must mean so much to you.");
                    break;
                }
                System.out.println("What letter would you like to guess?");
                char try1 = keyboard.nextLine().toCharArray()[0];
                if (word.contains(try1)) {
                    System.out.println("wrong...fine it was right");
                    guessed.add(try1);
                } else {
                    System.out.println("Nope");
                    tries++;
                }

            }
            if (tries > 9) {
                System.out.println("You guessed too many wrong answers...you dummy");
            }
            //print do u want to play again
            System.out.println("Want to play again?");
//get answr (keyboard)
            String playagain = keyboard.nextLine();
//if (!answer.equals("yes")
            if (!playagain.equals("yes")) {
                playing= false;
            }
//playing=false
       
        }
    }

    public static boolean won() {
        boolean b = true;
        for (char l : word) {
            if (!guessed.contains(l)) {
                b = false;
            }
        }
        return b;
    }
}
