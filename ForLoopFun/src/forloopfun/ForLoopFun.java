package forloopfun;

import java.util.Scanner;

public class ForLoopFun {

    public static void main(String[] args) {
        /* for (int i = 0; i < 10; i++) {
            System.out.println("I love Java");
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter a number. If you don't...I'll cut you.");
        int answer = Integer.parseInt(keyboard.nextLine());
        for (int j = 0; j < answer; j++) {
            System.out.print(j + " ");
        }
        System.out.println("\nPlease, enter a starting number. If you don't...I'll cut you.");
        int answer2 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Please, enter a ending number. If you don't...I'll cut you.");
        int answer3 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Please, enter a number to count by. If you don't...I'll cut you.");
        int answer4 = Integer.parseInt(keyboard.nextLine());
        for (int k = answer2; k < answer3; k += answer4) {
            System.out.print(k + " ");
        }
        System.out.println();
        int[] array1 = new int[10];
        int index = 0;
        while (index < 10) {
            array1[index] = index + 1;
            //System.out.print(array1[index]);
            index++;
        }
        int[] array2 = new int[10];
        for (int index3 = 0; index3 < 10; index3++) {
            array2[index3] = array1[index3] + 2;
            System.out.print(array2[index3] + " ");
        }*/
        int[] array3 = new int[100];
        for (int index3 = 0; index3 < 100; index3++) {
            array3[index3] = index3;
            System.out.print(array3[index3] + " ");
            if (index3 % 5 == 0) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}
