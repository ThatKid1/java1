package doubles;
import java.util.Scanner;
public class Doubles {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int n1 = (int) (Math.random() * 6);
        System.out.println(n1);
        int n2 = (int) (Math.random() * 6);
        System.out.println(n1);
       
       while (n1!=n2) {
           System.out.println();
    }
    
    }
}