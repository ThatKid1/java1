package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("How many times would you like it repeated?");
       int answer = Integer.parseInt (keyboard.nextLine());
       
       System.out.println("What you you like repeated?");
       String answer2 = keyboard.nextLine();
       
       System.out.println("Here we go!");
       int count = 1;
       while (count < answer) {
           System.out.println(count++ + ". "  + answer2);
       }
    }
    
}