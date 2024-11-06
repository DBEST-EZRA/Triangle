import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessScores {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            List<Integer> scores = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] scoreStrings = line.split(" ");
                for (String scoreString : scoreStrings) {
                    scores.add(Integer.parseInt(scoreString));
                }
            }

            reader.close();

            int total = 0;
            for (int score : scores) {
                total += score;
            }
            double average = (double) total / scores.size();

            Collections.sort(scores);

            // Output
            System.out.println("The Total is: " + total);
            System.out.println("The Average is: " + average);
            System.out.println("Scores in ascending order:");
            for (int score : scores) {
                System.out.print(score + " ");
            }
        } catch (IOException e) {
            System.err.println("Unable to read scores " + e.getMessage());
        }
    }
}