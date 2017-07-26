package puzzles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Puzzles {

    public static void main(String[] args) {
        String FILENAME = "puzzles.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            int line = 1;
            while (currentLine != null) {
                if (line % 3 == 0) {
                    System.out.println(currentLine);
                }
                line++;
                currentLine = reader.readLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
