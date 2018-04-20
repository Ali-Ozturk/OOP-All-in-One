package Courses.Course_7.Opgave4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem4 {
    public static void main(String[] args) {
        String fileName = "file.txt";

        if (args.length == 1){
            fileName = args[0];
        }

        Path path = Paths.get("out/production/OOP-All-in-One/Courses/Course_7/Opgave4/"+fileName);
        if (isFileAccepted(path)){
            try (BufferedReader reader = Files.newBufferedReader(path)){
                String line = null;
                int counter = 1;

                while ((line = reader.readLine()) != null){
                    System.out.println("Line ["+counter+"] | "+line);
                    ++counter;
                }

            } catch (IOException e) {
                System.out.println("Unable to read file!");
            }
        }
    }

    private static boolean isFileAccepted(Path path){
        if (!Files.exists(path)){
            System.out.println("File does not exist!");
            return false;
        }
        if (!Files.isRegularFile(path)){
            System.out.println("File is not of regular type!");
            return false;
        }
        if (!Files.isReadable(path)){
            System.out.println("File cannot be read!");
            return false;
        }

        System.out.println("File has been accepted!");
        return true;
    }
}
