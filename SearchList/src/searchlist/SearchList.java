package searchlist;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList();
        a1.add((int) (Math.random() * 50));
        a1.add((int) (Math.random() * 50));
        a1.add((int) (Math.random() * 50));
        a1.add((int) (Math.random() * 50));
        a1.add((int) (Math.random() * 50));
        a1.add((int) (Math.random() * 50));
        a1.add((int) (Math.random() * 50));
        a1.add((int) (Math.random() * 50));
        a1.add((int) (Math.random() * 50));
        a1.add((int) (Math.random() * 50));
        System.out.println("Search?");
        System.out.println(a1);
        int answer = Integer.parseInt(keyboard.nextLine());
        boolean found = false;
        if (a1.contains(answer)) {
            found = true;
            System.out.println("Found it!");
        } else {
            found = false;
            System.out.println("Didn't find it...");
        }
        int large = 0;
        for (int a : a1) {
            if (a>large) {
                large=a;
            }
        }
       
        System.out.println(large);
        ArrayList<String> a2 = new ArrayList();
        a2.add ("A"); a2.add ("bunch"); a2.add ("of"); a2.add ("revolutionary"); a2.add ("manumission"); a2.add ("aboloitionists.");
        a2.add ("Give"); a2.add ("me"); a2.add ("your"); a2.add ("position"); a2.add ("show"); a2.add ("me"); a2.add ("where"); a2.add ("the"); a2.add ("ammunition"); a2.add ("is."); 
    }
}
