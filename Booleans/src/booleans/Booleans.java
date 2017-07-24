package booleans;

public class Booleans {

   
    public static void main(String[] args) {
        int x,y;
        boolean a,b,c,d,e,f;
        x=3;
        y=4;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);   
        
        x=4;
        y=5;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);  
        String s1 = "Good Morning";
        String s2 = "Hi There!";
        String s3 = "Howdy Partner!";
        boolean eq = s1.equals(s2);
        int mn = s1.compareTo(s2);
        int nm = s1.compareTo(s2);
                
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("True and not true " + b1 && !b1 );
        System.out.println("True and not false " + b1 && b1);
        System.out.println();
        System.out.println();
        System.out.println();
        
    }
    
    
}
