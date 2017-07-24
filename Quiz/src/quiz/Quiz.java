package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
  
        System.out.println("Question 2: What is the capital of Texas?");
        System.out.println("\tA) Dallas");
        System.out.println("\tB) Austin");
        System.out.println("\tC) Houston");
        System.out.println("\tD) San Antonio");
        String answer2 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Austin!");
        }
        
        System.out.println("Question 3: What is the capital of Nevada?");
        System.out.println("\tA) Reno");
        System.out.println("\tB) Carson City");
        System.out.println("\tC) Las Vegas");
        System.out.println("\tD) Boulder City");
        String answer3 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Carson City");
        }
        System.out.println("Question 4: What is 1+1?");
        System.out.println("\tA) 1");
        System.out.println("\tB) 2");
        System.out.println("\tC) 3");
        System.out.println("\tD) 11");
        String answer4 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, 1+1 is 2!");
        }
        
        System.out.println("Question 5: Why Is the Sky Blue?");
        System.out.println("\tA) Light arrives on Earth from the sun in every colour (including 'colours' we can't see like UV and infrared). When the sunlight hits the Earth's atmosphere it collides with certain particles that 'shine' blue.");
        System.out.println("\tB) Because light bounces off water and shines blue.");
        System.out.println("\tC) Because!");
        System.out.println("\tD) IDK");
        String answer5 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the correct answer is B!");
        }
        
    
        System.out.println("Your score is " + rightAnswers + " out of 5 question.");
    }
    
}