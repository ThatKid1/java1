package graphingformulas;

public class GraphingFormulas {

    public static void main(String[] args) {

        //this part will test the functions
        System.out.println(" (0,-3) to (-1,-7) has slope " + slope(0, -3, -1, -7));
        System.out.println(" (2,8) to (4,-4) has slope " + slope(2, 8, 4, -4));

        System.out.println(" (0,-3) to (-1,-7) has distance " + distance(0, -3, -1, -7));
        System.out.println(" (2,8) to (4,-4) has distance " + distance(2, 8, 4, -4));

        formula(0, -3, -1, -7);
        formula(2, 8, 4, -4);
    }s

    public static double slope(int x1, int y1, int x2, int y2) {
        double slope = (y2-y1)/(x2-x1);
        return slope;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
        return distance;
    }
	
    public static void formula(int x1, int y1, int x2, int y2) {
        double m= slope(x1, y1, x2, y2);
        double b= y1-m*x1;
        System.out.println("y=" + m +"x+" + b);
    }
}
