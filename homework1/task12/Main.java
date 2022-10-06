package homework1.task12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.Phaser;

public class Main {
    private enum Data {
        John,
        Paul,
        George,
        Ringo
    }

    private static final Phaser phaser = new Phaser(1);

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("homework1/task12/resources/file.txt")) {
            List<Data> data = new ArrayList<>(List.of(Data.values()));
            Collections.shuffle(data);
            for (Data d : data) {
                phaser.register();
                Thread thread = new Thread(() ->
                {
                    try {
                        writer.write("Здесь был " + d.toString() + '\n');
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } finally {
                        phaser.arriveAndDeregister();
                    }
                });
                thread.start();
            }
            phaser.arriveAndAwaitAdvance();
        } catch (IOException e) {
            //
        }

    }
}
