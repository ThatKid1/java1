package math.operations;

public class MathOperations {
     public static void main( String[] args ) {
         int p,q,r,s,t,u,x,w,v,m,n;
          double a,b,c;
          String first, second, together;
 
          p = 8;
          q = 25;
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();

         x = 1/1;
         x+=2;
         w = 2+2;
         v = 3*3;
         w-=4; 
         m = 4+4;     
         n = 5*5; 
         System.out.println(p + "\n" + w + "\n" + v + "\n" + m + "\n" + n);
         
         first = "peanut butter";
         second = "jelly";
         together = first + " and " + second;
         System.out.println( together );
     }
}

