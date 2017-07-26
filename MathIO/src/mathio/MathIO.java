package mathio;

import java.io.*;

public class MathIO {

    public static void main(String[] args) {

        String FILENAME = "numbers.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
            String line1 = "1";
            String line2 = "2";
            String line3 = "3";
            String line4 = "4";
            //here is where you should write your numbers to the file
            writer.write(line1);
            writer.write("\n" + line2);
            writer.write("\n" + line3);
            writer.write("\n" + line4);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();

        }

        //Part 2
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            double sum = 0;
            while (currentLine != null) {
                System.out.println(currentLine);
                sum += Double.parseDouble(currentLine);
                currentLine = reader.readLine();
                System.out.println(sum);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
