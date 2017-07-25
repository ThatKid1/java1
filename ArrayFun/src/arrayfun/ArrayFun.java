package arrayfun;

public class ArrayFun {

    public static void main(String[] args) {
        /* 
    int[] array1 = new int[10];

        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 5;
        array1[3] = 7;
        array1[4] = 9;
        array1[5] = 11;
        array1[6] = 13;
        array1[7] = 15;
        array1[8] = 17;
        array1[9] = 19;

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
        System.out.println(array1[5]);
        System.out.println(array1[6]);
        System.out.println(array1[7]);
        System.out.println(array1[8]);
        System.out.println(array1[9]);

        double[] array2 = new double[10];
        int index = 0;
        while (index < 10) {
            array2[index] = 1.25;
            System.out.println(array2[index]);
            index++;
        }
        double[] array3 = new double[1000];
        int index2 = 0;
        while (index2 < 1000) {
            array3[index2] = (int) (Math.random() * 1000) + 1;;
            System.out.println(array3[index2]);
            index2++;*/
        int[] array = new int[1000];
        int index = 0;
        while (index < 1000) {
            System.out.print(index);
            if (index % 5 == 0) {
                System.out.print("!");
            }
            System.out.println();
            index++;
        }

    }
}
