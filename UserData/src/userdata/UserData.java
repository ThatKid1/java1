package userdata;

import java.util.Scanner;
public class UserData {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name = keyboard.nextLine();
        System.out.println( "What is your age?" );
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println( "What day is your birthday?" );
        int day = Integer.parseInt (keyboard.nextLine());
        System.out.println( "What month is your birthday?" );  
        String month = keyboard.nextLine ();
        System.out.println( "What year is your birthday?" ); 
        int year = Integer.parseInt (keyboard.nextLine());
        System.out.println( "What is your favorite book?" );
        String book = keyboard.nextLine();
        System.out.println( "What is your hometown?" );
        String town = keyboard.nextLine();
        System.out.println( "What is your lucky number?" );
        double number = Double.parseDouble (keyboard.nextLine());
        System.out.println( "What is your shoe size?" );
        double shoe = Double.parseDouble (keyboard.nextLine());
        System.out.println( "On a scale of 1 to 5, how excited are you to use Java?" );
        double Java = Double.parseDouble(keyboard.nextLine());
        System.out.println( "What is cool fact about you?" );
        String fact = keyboard.nextLine();
        
        System.out.println(name + ", age, " + age + " was born on " + month + " " + day + ", " + year + ". From " + town + ", " + name + " has a lucky number " + number + " and a shoe size of " + shoe + ". One a scale of 1 to 5, " + name + " is this excited to learn about Java: " + Java + ". A fun fact about " + name + " is:" + fact + ".");
        int age2 = age+5;
        System.out.println("Your age 5 years from now is " + age2);
        boolean trueage = age==day;
        System.out.println(trueage + "If true, the day you were born is your age.");
        boolean birthyear = year/2000 >= 1;
        System.out.println(birthyear + " If true, you were born in 2000 or later.");
        double level = shoe*Java;
        System.out.println(level + "This is your true excitement level.");
//        boolean 













    }
    
}