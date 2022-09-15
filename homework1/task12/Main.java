package homework1.task12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    private enum Data {
        John,
        Paul,
        George,
        Ringo
    }

    public static void main(String[] args) {
            try (FileWriter writer = new FileWriter("homework1/task12/resources/file.txt")){
                List<Data> data = new ArrayList<>(List.of(Data.values()));
                Collections.shuffle(data);
                for (Data d : data) {
                    writer.write("Здесь был " + d.toString() + '\n');
                }
            } catch (IOException e) {
                //
            }

    }
}
