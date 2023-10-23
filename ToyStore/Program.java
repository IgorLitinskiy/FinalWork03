package ToyStore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
public class Program {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ToyStore/List.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
             
            Random random = new Random();
            int index = random.nextInt(lines.size());
            String randomLine = lines.get(index);
            System.out.println("Ваш выигрыш " + randomLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}