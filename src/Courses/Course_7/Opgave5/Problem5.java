package Courses.Course_7.Opgave5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem5 {
    public static void main(String[] args) {
        // Problem5.txt Hello 10
        String fileName = "Problem5.txt";
        String string = "Hello";
        int number = 10;

        if (args.length == 3){
            fileName = args[0];
            string = args[1];
            number = Integer.parseInt(args[2]);
        }

        Path path = Paths.get("out/production/OOP-All-in-One/Courses/Course_7/Opgave5/"+fileName);

        if (!Files.exists(path)){
            try {
                Files.createFile(path);
            } catch (IOException e){
                System.out.println("Unable to create file! | " + e.getMessage());
            }

            try (BufferedWriter writer = Files.newBufferedWriter(path)){
                for (int i = 0; i < number ; i++) {
                    writer.write(string);
                    writer.newLine();
                }
            } catch (IOException e){
                System.out.println("Was not able to write to file!");
            }
        }

    }
}
